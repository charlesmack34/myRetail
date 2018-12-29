package com.casestudy.target.myretailrestservice.controller;

import com.casestudy.target.myretailrestservice.dao.ProductDao;
import com.casestudy.target.myretailrestservice.model.db.ProductPrice;
import com.casestudy.target.myretailrestservice.model.redsky.CurrencyCode;
import com.casestudy.target.myretailrestservice.model.redsky.Price;
import com.casestudy.target.myretailrestservice.model.redsky.Product;
import com.casestudy.target.myretailrestservice.model.redsky.RedSkyServiceResponse;
import com.casestudy.target.myretailrestservice.model.serviceRequest.MyRetailServiceRequest;
import com.casestudy.target.myretailrestservice.model.serviceResponse.MyRetailServiceResponse;
import com.casestudy.target.myretailrestservice.service.RedSkyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MyRetailController {

    @Autowired
    RedSkyService redSkyService;

    @Autowired
    ProductDao productDao;

    @GetMapping(value = "/products/{id}")
    public ResponseEntity getProductById(@PathVariable("id") Long id) {

        MyRetailServiceResponse myRetailServiceResponse = new MyRetailServiceResponse();

        try {

            // Call service to retrieve base product details
            RedSkyServiceResponse redSkyServiceResponse = redSkyService.redSkyServiceGetProductRestCall(id);

            Product redSkyProduct = (redSkyServiceResponse != null && redSkyServiceResponse.getProduct() != null)
                    ? redSkyServiceResponse.getProduct() : null;

            //Build Response
            if (redSkyProduct != null) {

                // Read DB to collect price info
                ProductPrice productPrice = productDao.getPriceById(id);

                myRetailServiceResponse = MyRetailServiceResponse.builder()
                        .id(Long.valueOf(redSkyProduct.getAvailable_to_promise_network().getProduct_id()))
                        .name(redSkyProduct.getItem().getProduct_description().getTitle())
                        .current_price(new Price(productPrice.getPrice(), CurrencyCode.USD))
                        .build();


            }

        } catch (Exception e) {
            return new ResponseEntity("Error occurred while retrieving product", HttpStatus.OK);
        }

        return new ResponseEntity(myRetailServiceResponse, HttpStatus.OK);

    }

    @PutMapping(value = "/products/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<String> updateProductPriceById(@RequestBody @Valid MyRetailServiceRequest myRetailServiceRequest,
                                                                       @PathVariable("id") Long id) {

        try {

            if (myRetailServiceRequest != null && myRetailServiceRequest.getNew_price() != null) {

                // Attempt to update DB to with new price info
                boolean priceUpdated = productDao.updateProductPrice(id, myRetailServiceRequest.getNew_price().getValue());

                if (priceUpdated) {

                    return new ResponseEntity<String>("Successfully updated the product's price.", HttpStatus.OK);

                } else {

                    return new ResponseEntity<String>("Failed to update product's price.", HttpStatus.OK);

                }

            } else {
                return new ResponseEntity("Incomplete request", HttpStatus.BAD_REQUEST);
            }

        } catch (Exception e) {
            return new ResponseEntity("Error occurred while retrieving product", HttpStatus.OK);
        }

    }

}

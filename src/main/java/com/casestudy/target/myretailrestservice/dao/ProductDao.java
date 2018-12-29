package com.casestudy.target.myretailrestservice.dao;

import com.casestudy.target.myretailrestservice.model.db.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class ProductDao {

    private final String GET_PRODUCT_BY_ID_SQL = "SELECT product_id, price FROM product.product_price WHERE product_id = ?";

    private final String UPDATE_PRODUCT_PRICE_BY_ID_SQL = "UPDATE product.product_price SET price = ?, update_dttm = now() WHERE product_id = ?";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ProductPrice getPriceById(Long productId) throws EmptyResultDataAccessException {

        ProductPrice productPrice = jdbcTemplate.queryForObject(
                GET_PRODUCT_BY_ID_SQL,
                new Object[]{productId},
                new ProductMapper()
        );

        return productPrice;

    }

    public boolean updateProductPrice(Long productId, BigDecimal newPrice) {

        int rowsUpdated = jdbcTemplate.update(
                UPDATE_PRODUCT_PRICE_BY_ID_SQL,
                new Object[]{newPrice, productId}
        );

        return rowsUpdated > 0 ? true : false;
    }

}

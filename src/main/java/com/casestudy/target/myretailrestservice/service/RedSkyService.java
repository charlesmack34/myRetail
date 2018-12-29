package com.casestudy.target.myretailrestservice.service;

import com.casestudy.target.myretailrestservice.model.redsky.RedSkyServiceResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RedSkyService {

    private final String REDSKY_VENDOR_URL = "https://redsky.target.com/v2/pdp/tcin/{productId}?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";

    private final RestTemplate restTemplate;

    public RedSkyService(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplate = restTemplateBuilder.build();

    }

    /**
     * External call to mimic Vendor API call
     * @param productId
     * @return redSkyServiceResponse
     */
    public RedSkyServiceResponse redSkyServiceGetProductRestCall(Long productId) {

        return this.restTemplate.getForObject(REDSKY_VENDOR_URL, RedSkyServiceResponse.class, productId);

    }

}

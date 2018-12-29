package com.casestudy.target.myretailrestservice.model.redsky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferPrice implements Serializable {

    private BigDecimal minPrice;

    private BigDecimal maxPrice;

    private BigDecimal price;

    private String formattedPrice;

    private String priceType;

    private Long startDate;

    private Long endDate;

    private String saveDollar;

    private String savePercent;

    private String eyebrow;

    @JsonProperty(value = "null")
    private boolean test;

}

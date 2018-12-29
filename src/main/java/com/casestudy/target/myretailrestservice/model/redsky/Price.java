package com.casestudy.target.myretailrestservice.model.redsky;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Price implements Serializable {

    private BigDecimal value;

    private CurrencyCode currency_code;

}

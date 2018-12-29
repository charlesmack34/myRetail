package com.casestudy.target.myretailrestservice.model.db;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class ProductPrice implements Serializable {

    private Long productId;

    private BigDecimal price;

}

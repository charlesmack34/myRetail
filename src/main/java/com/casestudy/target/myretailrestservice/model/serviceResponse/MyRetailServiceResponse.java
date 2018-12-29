package com.casestudy.target.myretailrestservice.model.serviceResponse;

import com.casestudy.target.myretailrestservice.model.redsky.Price;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class MyRetailServiceResponse implements Serializable {

    private Long id;

    private String name;

    private Price current_price;

}

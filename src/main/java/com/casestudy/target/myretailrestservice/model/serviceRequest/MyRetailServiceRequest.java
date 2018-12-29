package com.casestudy.target.myretailrestservice.model.serviceRequest;

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
public class MyRetailServiceRequest implements Serializable {

    private Price new_price;

}

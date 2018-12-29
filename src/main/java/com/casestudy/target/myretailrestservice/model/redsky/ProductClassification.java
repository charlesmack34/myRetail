package com.casestudy.target.myretailrestservice.model.redsky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductClassification implements Serializable {

    private String product_type;

    private String product_type_name;

    private String item_type_name;

    private ItemType item_type;

}

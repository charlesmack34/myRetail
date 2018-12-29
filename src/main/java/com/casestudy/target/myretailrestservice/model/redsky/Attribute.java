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
public class Attribute implements Serializable {

    private String gift_wrapable;

    private String has_prop65;

    private String is_hazmat;

    private Long max_order_qty;

    private String street_date;

    private String media_format;

    private String merch_class;

    private Long merch_classid;

    private Long merch_subclass;

    private String return_method;

}

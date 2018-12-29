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
public class BundleComponents implements Serializable {

    private boolean is_assortment;

    private boolean is_kit_master;

    private boolean is_standard_item;

    private boolean is_component;

}

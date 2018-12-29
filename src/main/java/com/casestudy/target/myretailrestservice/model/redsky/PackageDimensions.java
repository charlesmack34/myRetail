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
public class PackageDimensions implements Serializable {

    private String weight;

    private String weight_unit_of_measure;

    private String width;

    private String depth;

    private String height;

    private String dimension_unit_of_measure;

}

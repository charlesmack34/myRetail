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
public class Product implements Serializable {

    private DeepRedLabels deep_red_labels;

    private AvailableToPromiseNetwork available_to_promise_network;

    private Item item;

}

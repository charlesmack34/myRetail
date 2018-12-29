package com.casestudy.target.myretailrestservice.model.redsky;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableToPromiseNetwork implements Serializable {

    private String product_id;

    private String id_type;

    private Long available_to_promise_quantity;

    private String street_date;

    private String availability;

    private Long online_available_to_promise_quantity;

    private Long stores_available_to_promise_quantity;

    private String availability_status;

    private List<MultichannelOption> multichannel_options;

    private boolean is_infinite_inventory;

    private String loyalty_availability_status;

    private String loyalty_purchase_start_date_time;

    private boolean is_loyalty_purchase_enabled;

    private boolean is_out_of_stock_in_all_store_locations;

    private boolean is_out_of_stock_in_all_online_locations;



}

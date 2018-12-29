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
public class Item implements Serializable {

    private String tcin;

    private BundleComponents bundle_components;

    private String dpci;

    private String upd;

    private ProductDescription product_description;

    private String parent_items;

    private String buy_url;

    private Variation variation;

    private Enrichment enrichment;

    private String return_method;

    private Handling handling;

    private RecallCompliance recall_compliance;

    private TaxCategory tax_category;

    private DisplayOption display_option;

    private Fulfillment fulfillment;

    private PackageDimensions package_dimensions;

    private EnvironmentalSegmentation environmental_segmentation;

    private Manufacturer manufacturer;

    private List<ProductVendor> product_vendors;

    private ProductClassification product_classification;

    private ProductBrand product_brand;

    private String item_state;

    private List<Specification> specifications;

    private Attribute attributes;

    private String country_of_origin;

    private String relationship_type_code;

    private boolean subscription_eligible;

    private List<Ribbon> ribbons;

    private List<Tag> tags;

    private String estore_item_status_code;

    private boolean is_proposition_65;

    private ReturnPolicies return_policies;

    private boolean gifting_enabled;

}

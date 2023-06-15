package org.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@lombok.Data
public class Data {

    private int postcode;
    private String country;
    private String country_abbreviation;
    private Places[] places;

}

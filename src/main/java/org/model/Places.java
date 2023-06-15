package org.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Places {
    private String place_name;
    private String longitude;
    private String state;
    private String state_abbreviation;
    private String latitude;
}

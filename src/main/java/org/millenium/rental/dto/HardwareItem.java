package org.millenium.rental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class HardwareItem {

    private Long item_id;
    private String name;
    private Integer rental_per_day;
    private Integer fine_per_day;
    private String availability;
}

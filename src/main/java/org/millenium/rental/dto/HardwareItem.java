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
    private Long name;
    private Long rental_per_day;
    private Long fine_per_day;
    private Long availability;
}

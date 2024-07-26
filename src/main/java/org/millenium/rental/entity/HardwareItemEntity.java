package org.millenium.rental.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "hardware_item")
public class HardwareItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long item_id;
    private String name;
    private Integer rental_per_day;
    private Integer fine_per_day;
    private String availability;
}

package org.millenium.rental.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@
public class RentalEntity {

    private Long id;
    private Date rentl_date;
    private Date return_date;
    private Date due_date;
    private Date fine;
    private Date total_cost;

}

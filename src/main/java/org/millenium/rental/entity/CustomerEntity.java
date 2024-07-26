package org.millenium.rental.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerEntity {

    @Id
    private Long id;
    private String name;
    private String city;
    private String contact;
}

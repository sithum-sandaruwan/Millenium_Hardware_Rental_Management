package org.millenium.rental.service;

import org.millenium.rental.dto.Customer;
import org.millenium.rental.dto.Rental;

import java.util.List;

public interface RentalService {
    void addRental(Rental rental);

    List<Rental> getAllRentals();

    void deleteRentalById(Long rent_id);

    void updateRental(Rental rental);
}

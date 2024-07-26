package org.millenium.rental.controller;

import lombok.RequiredArgsConstructor;
import org.millenium.rental.dto.Customer;
import org.millenium.rental.dto.Rental;
import org.millenium.rental.service.CustomerService;
import org.millenium.rental.service.RentalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rental-controller")
@CrossOrigin
public class RentalController {

//    List<Customer> customers = new ArrayList();

    final RentalService rentalService;

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Rental rental) {

        rentalService.addRental(rental);
    }

    @GetMapping("/get-all-rentals")
    public List<Rental> getAllRentals() {

        return rentalService.getAllRentals();
    }

    @DeleteMapping("/delete-customer/{id}")
    public void deleteRentalById(@PathVariable Long rent_id) {

        rentalService.deleteRentalById(rent_id);

    }

    @PostMapping("/update-customer")
    public void updateCustomerById(@RequestBody Rental rental) {

        rentalService.updateRental(rental);

    }


}
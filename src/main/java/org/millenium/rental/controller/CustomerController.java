package org.millenium.rental.controller;

import lombok.RequiredArgsConstructor;
import org.millenium.rental.dto.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer-controller")
public class CustomerController {

    List<Customer> customers = new ArrayList();

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
    }

    @GetMapping("/get-all-cust")
    public List<Customer> getAllCustomers() {
        return customers;
    }

    @PostMapping("/delete-customer/{id}")
    void deleteCustomerById(@PathVariable Long id) {


    }

    @PostMapping
    void updateCustomerById(@RequestBody Customer customer) {

    }


}

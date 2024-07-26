package org.millenium.rental.controller;

import lombok.RequiredArgsConstructor;
import org.millenium.rental.dto.Customer;
import org.millenium.rental.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer-controller")
public class CustomerController {

//    List<Customer> customers = new ArrayList();

    final CustomerService customerService;

    @PostMapping("/add-customer")
    public void addCustomer(@RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @GetMapping("/get-all-cust")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/delete-customer/{id}")
    public String deleteCustomerById(@PathVariable Long id) {

        customerService.deleteCustomerById(id);
        return "Deleted";
    }

    @PostMapping("/update-customer")
    public void updateCustomerById(@RequestBody Customer customer) {

        customerService.updateCustomerById(customer);

    }


}

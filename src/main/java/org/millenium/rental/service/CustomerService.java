package org.millenium.rental.service;

import org.millenium.rental.dto.Customer;

import java.util.List;

public interface CustomerService {

    void addCustomer(Customer customer);
    List<Customer> getAllCustomers();

    void deleteCustomerById(Long id);

    void updateCustomerById(Customer customer);
}

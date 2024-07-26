package org.millenium.rental.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.millenium.rental.dto.Customer;
import org.millenium.rental.entity.CustomerEntity;
import org.millenium.rental.repository.CustomerRepo;
import org.millenium.rental.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepo customerRepo;

    @Override
    public void addCustomer(Customer customer) {
        CustomerEntity customerEntity = new ObjectMapper().convertValue(customer, CustomerEntity.class);
        customerRepo.save(customerEntity);
    }

    @Override
    public List<Customer> getAllCustomers() {

        ArrayList<Customer> customerList = new ArrayList<>();

        List<CustomerEntity> all = customerRepo.findAll();

        all.forEach(customerEntity -> {
            customerList.add(new ObjectMapper().convertValue(customerEntity, Customer.class));
        });
        return customerList;
    }

    @Override
    public void deleteCustomerById(Long id) {
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }
    }

    @Override
    public void updateCustomerById(Customer customer) {

        if (customerRepo.findById(customer.getId()).isPresent()){
            customerRepo.save(new ObjectMapper().convertValue(customer,CustomerEntity.class));
        }
    }
}

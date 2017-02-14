package com.techsamar.test.framework.service;

import com.techsamar.test.framework.domain.Customer;
import com.techsamar.test.framework.dbaccess.CustomerRepository;

import java.util.List;

public class CustomerServiceImp implements CustomerService {
    private CustomerRepository customerRepository;

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //    public CustomerServiceImp(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

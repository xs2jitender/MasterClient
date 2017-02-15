package com.techsamar.test.framework.service;

import com.techsamar.test.framework.domain.Customer;
import com.techsamar.test.framework.dbaccess.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImp implements CustomerService {

    private CustomerRepository customerRepository;


    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerServiceImp() {
        System.out.println("using blank constructor injection -- customerServiceImpl");
    }


    public CustomerServiceImp(CustomerRepository customerRepository) {
        System.out.println("using constructor injection -- customerServiceImpl");
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}

package com.techsamar.test.framework.service;

import com.techsamar.test.framework.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}

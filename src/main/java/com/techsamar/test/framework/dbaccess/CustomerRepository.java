package com.techsamar.test.framework.dbaccess;

import com.techsamar.test.framework.domain.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}

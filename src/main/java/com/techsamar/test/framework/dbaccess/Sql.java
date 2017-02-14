package com.techsamar.test.framework.dbaccess;

import com.techsamar.test.framework.domain.Customer;


import java.util.ArrayList;
import java.util.List;

public class Sql implements CustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("Samar");
        customer.setLastName("Singh");
        customers.add(customer);
        return customers;
    }
}

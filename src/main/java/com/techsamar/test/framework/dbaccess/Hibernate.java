package com.techsamar.test.framework.dbaccess;

import com.techsamar.test.framework.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository("customerRepository")
@Repository
public class Hibernate implements CustomerRepository {
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("Jitender");
        customer.setLastName("Singh");
        customers.add(customer);
        return customers;
    }
}

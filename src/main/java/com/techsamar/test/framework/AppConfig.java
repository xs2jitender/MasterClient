package com.techsamar.test.framework;

import com.techsamar.test.framework.dbaccess.CustomerRepository;
import com.techsamar.test.framework.dbaccess.Hibernate;
import com.techsamar.test.framework.service.CustomerService;
import com.techsamar.test.framework.service.CustomerServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.techsamar.test.framework"})
public class AppConfig {

//    @Bean(name="customerService")
//    public CustomerService getCustomerService() {
//        CustomerServiceImp service = new CustomerServiceImp();
////        service.setCustomerRepository(getCustomerRepository());
//        return service;
//    }
//
//    @Bean(name="customerRepository")
//    public CustomerRepository getCustomerRepository() {
//        return new Hibernate();
//    }

}

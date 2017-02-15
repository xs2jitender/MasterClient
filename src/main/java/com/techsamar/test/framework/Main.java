package com.techsamar.test.framework;

import com.techsamar.test.framework.service.CustomerService;
import com.techsamar.test.framework.service.CustomerServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService.findAll().get(0).getFirstName());
    }
}

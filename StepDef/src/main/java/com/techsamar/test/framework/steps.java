package com.techsamar.test.framework;

import cucumber.api.java.en.Given;

public class steps {
    @Given("^something$")
    public void something() {
        System.out.println("hello");
    }
}

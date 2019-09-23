package com.jmendoza.springboot.cloud.apicustomer.model;

public class Customer {

    private String id;
    private String fistsName;
    private String lastName;

    public Customer(String id, String fistsName, String lastName) {
        this.id = id;
        this.fistsName = fistsName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFistsName() {
        return fistsName;
    }

    public String getLastName() {
        return lastName;
    }
}

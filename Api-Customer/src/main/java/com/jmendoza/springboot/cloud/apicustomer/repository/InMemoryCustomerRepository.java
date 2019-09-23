package com.jmendoza.springboot.cloud.apicustomer.repository;

import com.jmendoza.springboot.cloud.apicustomer.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryCustomerRepository {
    private final Map<String, Customer> inMemoryDb = new HashMap<>();

    public void create(Customer circle) {
        inMemoryDb.put(circle.getId(), circle);
    }

    public Optional<Customer> getById(String id) {
        return Optional.ofNullable(inMemoryDb.get(id));
    }
}

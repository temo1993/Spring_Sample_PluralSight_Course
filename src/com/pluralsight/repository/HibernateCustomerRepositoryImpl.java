package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    @Override
    public List<Customer> findAll(){

        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Temo");
        customer.setLastName("123");
        customers.add(customer);
        return customers;
    }
}

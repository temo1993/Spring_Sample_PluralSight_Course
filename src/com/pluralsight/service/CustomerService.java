package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by temo on 4/1/16.
 */
public interface CustomerService {
    List<Customer> findAll();
}

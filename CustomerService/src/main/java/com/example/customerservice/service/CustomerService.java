package com.example.customerservice.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.customerservice.model.Customer;
import com.example.customerservice.repositories.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


}


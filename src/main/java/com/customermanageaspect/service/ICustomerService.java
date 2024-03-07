package com.customermanageaspect.service;

import com.customermanageaspect.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    Iterable<Customer> findAll() throws Exception;

    Optional findOne(Long id) throws Exception;
}

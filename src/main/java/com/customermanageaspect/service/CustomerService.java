package com.customermanageaspect.service;

import com.customermanageaspect.model.Customer;
import com.customermanageaspect.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Iterable<Customer> findAll() throws Exception {
        Iterable<Customer> list = customerRepository.findAll();
        if (list == null){
            throw new Exception("a dummy exception");
        }
        return list;
    }

    @Override
    public Optional<Customer> findOne(Long id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.get().getName() == null) {
            throw new Exception("customer not found!");
        }
        return customer;
    }
}

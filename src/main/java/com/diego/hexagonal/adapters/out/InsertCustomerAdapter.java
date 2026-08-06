package com.diego.hexagonal.adapters.out;

import com.diego.hexagonal.adapters.out.repository.CustomerRepository;
import com.diego.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.diego.hexagonal.application.core.domain.Customer;
import com.diego.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }

}

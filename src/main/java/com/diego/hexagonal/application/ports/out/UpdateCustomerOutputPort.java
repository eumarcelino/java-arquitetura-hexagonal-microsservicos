package com.diego.hexagonal.application.ports.out;

import com.diego.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}

package com.diego.hexagonal.application.ports.in;

import com.diego.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert (Customer customer, String zipCode);

}

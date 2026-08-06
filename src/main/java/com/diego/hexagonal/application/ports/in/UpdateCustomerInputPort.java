package com.diego.hexagonal.application.ports.in;

import com.diego.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update (Customer customer, String zipCode);

}

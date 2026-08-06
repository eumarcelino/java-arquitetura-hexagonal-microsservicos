package com.diego.hexagonal.application.ports.in;

import com.diego.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}

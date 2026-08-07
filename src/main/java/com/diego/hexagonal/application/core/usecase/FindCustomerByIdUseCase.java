package com.diego.hexagonal.application.core.usecase;

import com.diego.hexagonal.application.core.domain.Customer;
import com.diego.hexagonal.application.core.exceptions.ObjectNotFoundException;
import com.diego.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.diego.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new ObjectNotFoundException("Customer not found"));

    }
}

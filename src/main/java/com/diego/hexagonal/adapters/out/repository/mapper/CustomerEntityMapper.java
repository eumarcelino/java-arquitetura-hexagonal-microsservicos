package com.diego.hexagonal.adapters.out.repository.mapper;

import com.diego.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.diego.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface CustomerEntityMapper {

    @Mapping(target = "isValidCpf", source = "validCpf")
    CustomerEntity toCustomerEntity(Customer customer);

    @Mapping(target = "validCpf", source = "isValidCpf")
    Customer toCustomer(CustomerEntity customerEntity);
}

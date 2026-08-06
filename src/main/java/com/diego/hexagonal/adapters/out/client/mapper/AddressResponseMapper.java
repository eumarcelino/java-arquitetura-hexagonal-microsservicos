package com.diego.hexagonal.adapters.out.client.mapper;

import com.diego.hexagonal.adapters.out.client.response.AddressResponse;
import com.diego.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}

package com.diego.hexagonal.config;

import com.diego.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.diego.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.diego.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.diego.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.diego.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase (
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}

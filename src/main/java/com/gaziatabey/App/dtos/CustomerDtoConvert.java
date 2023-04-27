package com.gaziatabey.App.dtos;

import com.gaziatabey.App.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConvert {


    public CustomerDto convert ( Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName(customer.getName());
        customerDto.setSurName(customer.getSurName());
        return customerDto;
    }
}

package com.gaziatabey.App.service;

import com.gaziatabey.App.dtos.CustomerDto;
import com.gaziatabey.App.dtos.CustomerDtoConvert;
import com.gaziatabey.App.exception.CustomerNotFoundException;
import com.gaziatabey.App.model.Customer;
import com.gaziatabey.App.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerDtoConvert customerDtoConvert;

    public CustomerService(CustomerRepository customerRepository, CustomerDtoConvert customerDtoConvert) {
        this.customerRepository = customerRepository;
        this.customerDtoConvert = customerDtoConvert;
    }


    public CustomerDto getCustomerById(String id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);

        return customerOptional.map(customer -> customerDtoConvert.convert(customer)).orElse(new CustomerDto());
    }

    protected Customer findCustomerById(String id){
       return customerRepository.findById(id).orElseThrow(
               () -> new CustomerNotFoundException("Customer could not find by id: " + id));
    }

    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerDtoConvert::convert)
                .collect(Collectors.toList());

    }
}

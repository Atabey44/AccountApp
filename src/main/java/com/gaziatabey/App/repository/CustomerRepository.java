package com.gaziatabey.App.repository;

import com.gaziatabey.App.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {


}

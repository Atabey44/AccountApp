package com.gaziatabey.App.repository;

import com.gaziatabey.App.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}

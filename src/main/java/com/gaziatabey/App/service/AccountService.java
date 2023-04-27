package com.gaziatabey.App.service;

import com.gaziatabey.App.dtos.AccountDto;
import com.gaziatabey.App.dtos.AccountDtoConverter;
import com.gaziatabey.App.model.Account;
import com.gaziatabey.App.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final CustomerService customerService;
    private final AccountDtoConverter accountDtoConverter;

    public AccountService(AccountRepository accountRepository, CustomerService customerService, AccountDtoConverter accountDtoConverter) {
        this.accountRepository = accountRepository;
        this.customerService = customerService;
        this.accountDtoConverter = accountDtoConverter;
    }

    public AccountDto createAccount(AccountDto createAccountDto){
        Account account = new Account();
        account.setBalance(createAccountDto.getBalance());
        account.setCreationTime(createAccountDto.getCreationTime());
        accountRepository.save(account);
        return accountDtoConverter.convert(accountRepository.save(account));
    }
}

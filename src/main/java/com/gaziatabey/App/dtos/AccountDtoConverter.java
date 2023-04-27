package com.gaziatabey.App.dtos;

import com.gaziatabey.App.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDtoConverter {

       public AccountDto convert(Account account){
        AccountDto accountDto = new AccountDto();
        accountDto.setBalance(account.getBalance());
        accountDto.setCreationTime(account.getCreationTime());

        return accountDto;
    }
}

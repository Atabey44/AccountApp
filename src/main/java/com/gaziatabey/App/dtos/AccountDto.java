package com.gaziatabey.App.dtos;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {

    private BigDecimal balance;
    private LocalDateTime creationTime;
}

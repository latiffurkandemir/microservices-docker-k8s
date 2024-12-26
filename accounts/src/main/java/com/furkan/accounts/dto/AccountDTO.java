package com.furkan.accounts.dto;

import lombok.Data;

@Data
public class AccountDTO {
    private Long accountNumber;

    private String accountType;

    private String branchAddress;
}

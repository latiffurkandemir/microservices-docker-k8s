package com.furkan.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountDTO {

    @NotEmpty(message = "account number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "account number must be 10 digits")
    private Long accountNumber;

    @NotEmpty(message = "account type cannot be empty")
    private String accountType;

    @NotEmpty(message = "branch address cannot be empty")
    private String branchAddress;
}

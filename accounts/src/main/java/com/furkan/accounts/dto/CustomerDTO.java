package com.furkan.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDTO {
    @NotEmpty(message = "name cannot be empty")
    @Size(min = 5, max = 20, message = "name must be between 5 and 20 characters")
    private String name;

    @NotEmpty(message = "email cannot be empty")
    @Email()
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number must be 10 digits")
    private String mobileNumber;

    private AccountDTO accountDTO;

}

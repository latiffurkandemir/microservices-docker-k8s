package com.furkan.accounts.service;

import com.furkan.accounts.dto.CustomerDTO;

public interface AccountService {

    void createAccount(CustomerDTO customerDTO);
    CustomerDTO fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDTO customerDTO);

    boolean deleteAccount(String mobileNumber);
}

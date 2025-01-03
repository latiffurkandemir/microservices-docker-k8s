package com.furkan.loans.service;

import com.furkan.loans.dto.LoansDTO;

public interface LoansService {

    void createLoan(String mobileNumber);

    LoansDTO fetchLoan(String mobileNumber);


    boolean updateLoan(LoansDTO loansDto);


    boolean deleteLoan(String mobileNumber);
}

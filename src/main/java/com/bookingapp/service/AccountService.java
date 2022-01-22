package com.bookingapp.service;

import java.util.List;

import com.bookingapp.dto.AccountStatement;
import com.bookingapp.entity.Account;
import com.bookingapp.request.TransferBalanceRequest;

public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
    boolean sendMoney(
            TransferBalanceRequest transferBalanceRequest
    );
    AccountStatement getStatement(String accountNumber);
	void deleteAccount(Long id);
	boolean update(Account account);
	Account findByAccountNumber(String accountNumber);
	void deleteAll();
	Account findById(Long id);
}

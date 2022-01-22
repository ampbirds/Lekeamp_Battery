package com.bookingapp.request;

import lombok.NoArgsConstructor;



@NoArgsConstructor
public class AccountStatementRequest {
    private String accountNumber;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
    

}

package com.bookingapp.dto;

import java.math.BigDecimal;
import java.util.List;

import com.bookingapp.entity.Transaction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountStatement {
	public AccountStatement()
	{
		
	}
    public AccountStatement(BigDecimal currentBalance2, List<Transaction> findByAccountNumberEquals) {
		this.currentBalance = currentBalance2;
		this.transactionHistory = findByAccountNumberEquals;
	}
	BigDecimal currentBalance;
    List<Transaction> transactionHistory;
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}
	public void setTransactionHistory(List<Transaction> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}
    
    
}

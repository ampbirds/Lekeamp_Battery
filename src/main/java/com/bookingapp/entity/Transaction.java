package com.bookingapp.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "TRANSATION")
public class Transaction {
	public Transaction() {
		
	}
    public Transaction(long l, String fromAccountNumber,String toaccountNumber, BigDecimal amount, Timestamp timestamp) {
		this.transactionId = l;
		this.transactionAmount = amount;
		this.fromaccountNumber = fromAccountNumber;
		this.accountNumber = toaccountNumber;
		this.transactionDateTime = timestamp;
	}

	@Id
	@Column(name = "transaction_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

	@Column(name = "from_account")
    private String fromaccountNumber;
	
	@Column(name = "to_account")
    private String accountNumber;

	@Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

	@Column(name = "transaction_datetime")
    private Timestamp transactionDateTime;

	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getFromaccountNumber() {
		return fromaccountNumber;
	}
	public void setFromaccountNumber(String fromaccountNumber) {
		this.fromaccountNumber = fromaccountNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(BigDecimal transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public Timestamp getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(Timestamp transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	
	

}

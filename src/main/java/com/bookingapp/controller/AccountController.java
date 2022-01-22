package com.bookingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookingapp.dto.AccountStatement;
import com.bookingapp.entity.Account;
import com.bookingapp.exception.RecordNotFoundException;
import com.bookingapp.request.AccountStatementRequest;
import com.bookingapp.request.TransferBalanceRequest;
import com.bookingapp.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	private AccountService accountService;

	@PostMapping("/createOrUpdate")
	public ResponseEntity<List<Account>> createOrUpdate(Account account) throws RecordNotFoundException {
		accountService.save(account);
		return new ResponseEntity<List<Account>>(accountService.findAll(), new HttpHeaders(), HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public ResponseEntity<List<Account>> all() {
		return new ResponseEntity<List<Account>>(accountService.findAll(), new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) {
		accountService.deleteAccount(id);
		return HttpStatus.FORBIDDEN;
	}

	

	@PostMapping("/sendmoney")
	public String sendMoney(TransferBalanceRequest transferBalanceRequest) throws RecordNotFoundException {
		boolean tx = accountService.sendMoney(transferBalanceRequest);
		if (tx) {
			return "{'message':'Transaction completed'}";
		}
		return "{'message':'Transaction failed','reason':'Account not exist or not enough balance'}";
	}
	
	@RequestMapping("/statement")
    public ResponseEntity<AccountStatement> getStatement( AccountStatementRequest accountStatementRequest){
		AccountStatement accountStatement = accountService.getStatement(accountStatementRequest.getAccountNumber());
        return new ResponseEntity<AccountStatement>(accountStatement,new HttpHeaders(),HttpStatus.OK);

    }
	
	@PostMapping("/findByAccountNumber")
	public ResponseEntity<Account> findByAccountNumber(AccountStatementRequest accountStatementRequest){
		Account account = accountService.findByAccountNumber(accountStatementRequest.getAccountNumber());
		return new ResponseEntity<Account>(account,new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping("/deleteAll")
	public ResponseEntity<Account> deleteAll(){
		accountService.deleteAll();
		return new ResponseEntity<Account>(HttpStatus.FORBIDDEN);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Account> findById(@PathVariable("id") Long id){
		Account account = accountService.findById(id);
		return new ResponseEntity<Account>(account, new HttpHeaders(),HttpStatus.OK);
	}

}

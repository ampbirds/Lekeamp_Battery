package com.bookingapp.serviceimpl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookingapp.dto.AccountStatement;
import com.bookingapp.entity.Account;
import com.bookingapp.entity.Transaction;
import com.bookingapp.repository.AccountRepository;
import com.bookingapp.repository.TransactionRepository;
import com.bookingapp.request.TransferBalanceRequest;
import com.bookingapp.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    TransactionRepository transactionRepository;

    public Account save(Account account){
    	Account acc = accountRepository.findByAccountNumberEquals(account.getAccountNumber());
    	if(acc!=null) {
    		acc.setAccountEmail(account.getAccountEmail());
    		acc.setAccountMob(account.getAccountMob());
    		acc.setAccountName(account.getAccountName());
    		accountRepository.save(acc);
    	}else {
        accountRepository.save(account);
    	}
        return accountRepository.findByAccountNumberEquals(account.getAccountNumber());
    }

    public List<Account> findAll(){
        return accountRepository.findAll();
    }

    public Account findByAccountNumber(String accountNumber){
        Account account = accountRepository.findByAccountNumberEquals(accountNumber);
        return account;
    }


    @SuppressWarnings("unused")
	@Override
    public boolean sendMoney(
            TransferBalanceRequest transferBalanceRequest
    ) {
        String fromAccountNumber = transferBalanceRequest.getFromAccountNumber();
        String toAccountNumber = transferBalanceRequest.getToAccountNumber();
        BigDecimal amount = transferBalanceRequest.getAmount();
        Account fromAccount = accountRepository.findByAccountNumberEquals(
                fromAccountNumber
        );
        Account toAccount = accountRepository.findByAccountNumberEquals(toAccountNumber);
        if(fromAccount.getCurrentBalance().compareTo(BigDecimal.ONE) == 1
                && fromAccount.getCurrentBalance().compareTo(amount) == 1
        ){
            fromAccount.setCurrentBalance(fromAccount.getCurrentBalance().subtract(amount));
            accountRepository.save(fromAccount);
            toAccount.setCurrentBalance(toAccount.getCurrentBalance().add(amount));
            accountRepository.save(toAccount);
            Transaction transaction = transactionRepository.save(new Transaction(0L,fromAccountNumber,toAccountNumber,amount,new Timestamp(System.currentTimeMillis())));
            
            return true;
        }
        return false;
    }

    @Override
    public AccountStatement getStatement(String accountNumber) {
        Account account = accountRepository.findByAccountNumberEquals(accountNumber);
        return new AccountStatement(account.getCurrentBalance(),transactionRepository.findByAccountNumberEquals(accountNumber));
    }

	@Override
	public void deleteAccount(Long id) {
		Optional<Account> acc= accountRepository.findById(id);
		if(acc.isPresent()) {
			Account delAc = acc.get();
			accountRepository.delete(delAc);
		}
		
	}

	@Override
	public boolean update(Account account) {
		Optional<Account> acc= accountRepository.findById(account.getAccountId());
		if(acc.isPresent()) {
			Account delAc = acc.get();
			delAc.setAccountNumber(account.getAccountNumber());
			delAc.setCurrentBalance(account.getCurrentBalance());
			accountRepository.save(delAc);
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public void deleteAll() {
		accountRepository.deleteAll();
		
	}

	@Override
	public Account findById(Long id) {
		Optional<Account> account = accountRepository.findById(id);
		if(account.isPresent()) {
			return account.get();
		}
		return null;
	}
}

package com.flight.project.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.AccountRepository;
import com.flight.project.model.Account;
import com.flight.project.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired 
	AccountRepository accountRepo;
	
	@Override
	public void addAccount(Account account) {
		
		accountRepo.save(account);
	}

	@Override
	public void updateAccount(String accountNumber, Account account) {
		Account newacc=accountRepo.getById(accountNumber);
		newacc.setAccountNumber(account.getAccountNumber());
		newacc.setBalance(account.getBalance());
		accountRepo.save(newacc);
	}

}

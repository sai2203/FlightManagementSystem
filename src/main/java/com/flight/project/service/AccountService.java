package com.flight.project.service;

import com.flight.project.model.Account;

public interface AccountService {
public void addAccount(Account account);
public void updateAccount(String accountNumber, Account account);
}

package com.flight.project.service;

import com.flight.project.exceptions.InsufficientBalanceException;
import com.flight.project.model.Account;

public interface PaymentService {
public void doPayment(String accountNumber, Double amount) throws InsufficientBalanceException;
public void addPaymentdetails(Integer id, double totalCost);
}

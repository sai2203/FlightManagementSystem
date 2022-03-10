package com.flight.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.project.dao.AccountRepository;
import com.flight.project.dao.PaymentRepository;
import com.flight.project.exceptions.InsufficientBalanceException;
import com.flight.project.model.Account;
import com.flight.project.model.Payment;
import com.flight.project.service.PaymentService;

@Service
public class PaymentServiceImpl  implements PaymentService{
	
	@Autowired
	AccountRepository accountrepo;
	
	@Autowired
	PaymentRepository paymentrepo;

	@Override
	public void doPayment(String accountNumber, Double amount) throws InsufficientBalanceException {
		Account account = accountrepo.getById(accountNumber);
		Double balance= account.getBalance();
		if(balance>amount) {
			account.setBalance(balance-amount);
			accountrepo.save(account);
		}
		else {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		
		
	}
	
@Override
public void addPaymentdetails(Integer id,double totalcost) {
	Payment paymentdetails = new Payment(id,totalcost);
	paymentrepo.save(paymentdetails);
}

}

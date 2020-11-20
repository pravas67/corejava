package com.heraizen.cj.day7.bankaccount;

public interface BankAccountService {
	void deposit(float amt);

	void withdraw(float amt);

	float getBalance();
}

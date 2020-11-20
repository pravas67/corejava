package com.heraizen.cj.day7.bankaccount;

abstract class BankAccount implements BankAccountService {
	int accNo;
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", custName=" + custName + ", accType=" + accType + ", balance="
				+ balance + "]";
	}

	String custName;
	String accType;
	float balance;

	@Override
	public abstract void deposit(float amt);

	@Override
	public abstract void withdraw(float amt);

	@Override
	public abstract float getBalance();

}

package com.heraizen.cj.day7.bankaccount;

public abstract class BankAccountFactory extends BankAccount{
	@Override
	public void deposit(float amt) {
		if (amt < 0) {
			throw new NegativeAmountException();
		}
		super.balance += amt;
	}

	@Override
	public abstract void withdraw(float amt);

	@Override
	public float getBalance() {
		if (super.balance < 1000)
			throw new LowBalanceException();
		return super.balance;
	}
}

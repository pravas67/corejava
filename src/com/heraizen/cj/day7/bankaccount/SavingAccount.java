package com.heraizen.cj.day7.bankaccount;

public class SavingAccount extends BankAccountFactory {
	SavingAccount(int accNo, String custName, float balance) {
		if (balance < 1000) {
			throw new LowBalanceException();
		}
		super.accNo = accNo;
		super.custName = custName;
		super.balance = balance;
		super.accType = "Saving Account";
	}

	@Override
	public void withdraw(float amt) {
		if (amt < 0) {
			throw new NegativeAmountException();
		}
		if (amt > (super.balance - 1000))
			throw new InsufficientFundException();
		super.balance -= amt;

	}

}

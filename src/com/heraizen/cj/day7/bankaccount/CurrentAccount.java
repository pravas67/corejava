package com.heraizen.cj.day7.bankaccount;

public class CurrentAccount extends BankAccountFactory {
	CurrentAccount(int accNo, String custName, float balance) {
		if (balance < 5000) {
			throw new LowBalanceException("Amount is less to create an account");
		}
		super.accNo = accNo;
		super.custName = custName;
		super.balance = balance;
		super.accType = "Current Account";
	}

	@Override
	public void withdraw(float amt) {
		if (amt < 0) {
			throw new NegativeAmountException();
		}
		if (amt > (super.balance - 5000))
			throw new InsufficientFundException();
		super.balance -= amt;

	}

}

package com.heraizen.cj.day7.bankaccount;

public class BankManager {

	public static void main(String[] args) {
		BankAccount savingAccount = null;
		BankAccount currentAccount = null;
		try {
			savingAccount = new SavingAccount(1234567890, "Pravas", 2000);
			currentAccount = new CurrentAccount(1234567890, "Pravas", 25000);
			try {
				savingAccount.deposit(-1500);
				try {
					currentAccount.withdraw(21000);
				} catch (InsufficientFundException e3) {
					e3.printStackTrace();
				}
			} catch (NegativeAmountException e2) {
				e2.printStackTrace();
			}
		} catch (LowBalanceException e1) {
			e1.printStackTrace();
		}

	}

}

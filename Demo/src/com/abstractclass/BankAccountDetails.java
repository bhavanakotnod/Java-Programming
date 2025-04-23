package com.abstractclass;

public class BankAccountDetails {
	public static void main(String[] args) {
		BankAccount saving  = new SavingAccount(10000);
		saving.deposite(2000);
		saving.withdraw(500);
		saving.calculateInterest();
	}

}

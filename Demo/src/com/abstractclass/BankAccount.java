package com.abstractclass;

public abstract class BankAccount {
	double balance;
	public BankAccount(double initial_balance) {
		this.balance = initial_balance;
	}
	
	
	public  void deposite(double amount) {
		balance+=amount;
		System.out.println("Deposited: " + amount + " | New Balance: " + balance);
		
	}
	public  void withdraw(double amount) {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("Withdraw amount: "+amount + " New balance: "+balance);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	
	public abstract void calculateInterest();
	

}

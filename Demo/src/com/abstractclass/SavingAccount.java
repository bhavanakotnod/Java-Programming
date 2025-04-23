package com.abstractclass;

public class SavingAccount extends BankAccount{
	double interestRate = 0.05;   // 5% interest rate
	public SavingAccount(double initial_balance) {
		super(initial_balance);
		
	}

	@Override
	public void calculateInterest() {
		double interest = balance * interestRate;
		balance+=interest;
		System.out.println("interest added (saving): "+interest+"  new balance : "+balance);
		
		
	}
	
	

}

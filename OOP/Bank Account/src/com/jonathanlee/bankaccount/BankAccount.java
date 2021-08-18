package com.jonathanlee.bankaccount;


public class BankAccount {
	protected double checking_balance;
	protected double savings_balance;
	public static int totalnumofaccountinbank;
	private static double moneyinbank = 0;
	public long accountnumber;
	
	
	public BankAccount(double checkParam, double savingParam) {
		this.checking_balance = checkParam;
		this.savings_balance = savingParam;
		totalnumofaccountinbank++;
		moneyinbank+=checkParam+savingParam;
		this.accountnumber = this.generateaccountnumber();
	}

	//Random Account Number
	public long generateaccountnumber() {
		String accountnumber = "";
		for (int i = 0; i < 10; i++) {
			int randomnumber = (int)((Math.random() * (9 - 0)) + 0);
			accountnumber += randomnumber;
		}
		long finalaccountnumber = Long.parseLong(accountnumber);
		return finalaccountnumber;

	}
	//STATIC methods
	public static double moneyinbank() {
		return moneyinbank;
	}

	public static void change__bank_balance(double amount) {
		//when the user withdraws/deposits from their instance of an account, 
		//we want to make this same change to the BANK's balance
		BankAccount.moneyinbank += amount;
	}
	
	//INSTANCE methods
	
	//deposit - should increase that specific account AND the bank
	public void check_deposit(double amount) {
		this.checking_balance += amount;
		BankAccount.change__bank_balance(amount);
	}
	
	public void saving_deposit(double amount) {
		this.savings_balance += amount;
		BankAccount.change__bank_balance(amount);
	}
	
	//withdrawal - should decrease the specific account AND the bank if funds available
	public void check_withdraw(double amount_requested) {
		if (this.checking_balance < amount_requested) {
			System.out.println("Insufficient Funds");
		}
		else {
			this.checking_balance -= amount_requested;
			BankAccount.change__bank_balance(-amount_requested);
		}
	}
	public void saving_withdraw(double amount_requested) {
		if (this.savings_balance < amount_requested) {
			System.out.println("Insufficient Funds");
		}
		else {
			this.savings_balance -= amount_requested;
			BankAccount.change__bank_balance(amount_requested * -1);
		}
	}
}



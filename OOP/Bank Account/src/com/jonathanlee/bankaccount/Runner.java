package com.jonathanlee.bankaccount;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount pearl = new BankAccount(100.00, 100.00);
		//get bank's balance
		System.out.println(BankAccount.moneyinbank());
		//make deposit
		pearl.check_deposit(50.00);
		pearl.saving_deposit(25.00);
		//get pearl balance
		
		//get bank balance
		System.out.println(BankAccount.moneyinbank());
		//make withdrawal
		pearl.check_withdraw(15.00);
		pearl.saving_withdraw(25.00);
		//check pearl balance
		System.out.println(pearl.checking_balance);
		System.out.println(pearl.savings_balance);
		
		//check bank balance
		System.out.println(BankAccount.moneyinbank());
		
		pearl.check_withdraw(136);
		
		System.out.println(pearl.accountnumber);
	}

}

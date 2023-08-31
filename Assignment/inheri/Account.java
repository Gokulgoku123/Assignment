package com.assignment.inheri;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		System.out.println("Amount withdrawn successfully");
		balance = balance - amount;
	}
	void deposit(double amount) {
		System.out.println("Amount deposit successful");
		balance = balance + amount;
	}
	double getBalance() {
		return balance;
	}
}

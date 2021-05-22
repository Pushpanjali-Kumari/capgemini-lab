package com.capgemini.lab4;
//Exercise 1
public class Account extends Person {
	private long accNum;
	private double balance;
	private Person accHolder;
	

	public Account() {
		super();
	}
	
	
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
		
	public void deposit(double amt) {
		balance=balance+amt;
		setBalance(balance);
	}
	public void withdraw(double amt) {
		balance=balance-amt;
		setBalance(balance);
	}


	public boolean Withdraw(double amt) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

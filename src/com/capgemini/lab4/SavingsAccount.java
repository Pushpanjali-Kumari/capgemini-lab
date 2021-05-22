package com.capgemini.lab4;
//Exercise 1
public class SavingsAccount extends Account {
final double minBalance=500;

@Override
public void withdraw(double amt) {
	if(getBalance()<=minBalance) {
		System.out.println("Withdraw Denied! Low Balance..");
	}
	else
		setBalance(getBalance()-amt);
}
}

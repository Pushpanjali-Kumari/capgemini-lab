package com.capgemini.lab4;
//Exercise 1
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith = new Person("Smith",25);
		
		Person kathy = new Person("Kathy", 30);
		
		Account smithAccount = new SavingsAccount();
		smithAccount.setAccHolder(smith);
		smithAccount.setAccNum((long)(Math.random()*Math.pow(10,12)));
		smithAccount.setBalance(2000);
		
		Account kathyAccount = new CurrentAccount();
		kathyAccount.setAccHolder(kathy);
		kathyAccount.setAccNum((long)(Math.random()*Math.pow(10,12)));
		kathyAccount.setBalance(3000);
		
		System.out.println("Smith's Account Details:");
		System.out.println("Account No.="+smithAccount.getAccNum());
		System.out.println("After depositing 2000 INR in Smith's Account-");
		smithAccount.deposit(2000);
		System.out.println(smithAccount.getBalance());
		
		System.out.println("Kathy's Account Details:");
		System.out.println("Account No.="+kathyAccount.getAccNum());
		System.out.println("After withdrawing 2000 INR  from Kathy's Account-");
		kathyAccount.withdraw(2000);
		System.out.println(kathyAccount.getBalance());
	}

}

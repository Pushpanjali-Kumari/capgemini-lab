package com.capgemini.lab4;
//Exercise 1
public class CurrentAccount extends Account{
 double overDraftLimit=1000;
 
@Override
public boolean Withdraw(double amt) {
	 boolean result = false;
	if(amt>overDraftLimit) {
		System.out.println("Withdraw Denied!! Account is overdrawn..");
	}
	else {
		setBalance(getBalance()-amt);
		result=true;
    }
	return result;

}
}
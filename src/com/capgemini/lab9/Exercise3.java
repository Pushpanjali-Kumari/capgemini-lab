package com.capgemini.lab9;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails ud = ()->{
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter the username- ");
			   String userName = sc.next();
			   System.out.println("Enter the password- ");
			   String passWord = sc.next();
			   if(userName.equals("Pushpanjali") && passWord.equals("Capgemini_JA_17")) 
				   return true;
			   return false;
		   };
		   
		   if(ud.checkDetails()) {
			   System.out.println("User name and password are valid!!");
		   }else {
			   System.out.println("Invalid Input");
		   }
	}

}

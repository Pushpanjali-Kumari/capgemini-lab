package com.capgemini.lab5;
//LAB 5 EXERCISE 1
import java.util.Scanner;


public class AgeExcepMain {
	
	public static void validateAge(int age) throws AgeExcep
	{
		if(age<=15)
			throw new AgeExcep("Age is Below 15!!");
		else
			System.out.println("Valid Age.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter the age= ");
			int age=sc.nextInt();
			validateAge(age);
		}catch(AgeExcep e)
		{
			System.out.println("Exception... "+e.getMessage());
		}
		
		sc.close();

	}
}


	
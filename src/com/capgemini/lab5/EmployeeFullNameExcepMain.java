package com.capgemini.lab5;

//Lab 5 Excercise 2
import java.util.Scanner;

public class EmployeeFullNameExcepMain {
	public static void validateName(String name) throws EmployeeFullNameExcep {
		String nm[] = name.split(" ");
		if (nm[0].length() == 0)
			throw new EmployeeFullNameExcep("First Name cannot be blank!!");
		else if (nm.length < 2)
			throw new EmployeeFullNameExcep("Last Name cannot be blank!!");
		else
			System.out.println("Valid Name...");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the name of the employee= ");
			String name = sc.nextLine();
			validateName(name);
		} catch (EmployeeFullNameExcep e) {
			System.out.println("Exception..." + e.getMessage());
		}

		sc.close();
	}
}

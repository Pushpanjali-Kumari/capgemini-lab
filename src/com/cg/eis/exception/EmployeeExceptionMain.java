package com.cg.eis.exception;

//LAB 5 Excercise 3
import java.util.Scanner;

public class EmployeeExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter the salary of the employee= ");
			double salary = sc.nextDouble();
			validateSalary(salary);
		} catch (EmployeeException e) {
			System.out.println("Exception..." + e.getMessage());
		}

		sc.close();
	}

	private static void validateSalary(double salary) throws EmployeeException {
		// TODO Auto-generated method stub
		if (salary < 3000)
			throw new EmployeeException("Salary cannot be less than 3000!!");
		else
			System.out.println("Valid Salary...");

	}
}

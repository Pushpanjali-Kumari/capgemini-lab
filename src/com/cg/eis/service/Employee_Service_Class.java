package com.cg.eis.service;
//Lab 4 Exercise 2
import java.util.Scanner;

import com.cg.eis.bean.Employee;

interface EmployeeService {
	void getEmployeeDetails();

	void displayEmployeeDetails();
}

public class Employee_Service_Class extends Employee implements EmployeeService {
	Employee emp = new Employee();

	public void getEmployeeDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id- ");
		emp.Id = sc.nextInt();
		System.out.println("Enter name- ");
		emp.name = sc.next();
		System.out.println("Enter salary- ");
		emp.salary = sc.nextDouble();
		System.out.println("Enter designation- \nTrainee \nAnalyst \nProgrammer");
		emp.designation = sc.next();

		sc.close();
	}

	public void displayEmployeeDetails() {
		emp.insuranceScheme = "No Scheme";
		if ((emp.salary >= 20000) && emp.designation.equals("Trainee"))
			emp.insuranceScheme = "Scheme X";
		else if ((emp.salary >= 30000) && emp.designation.equals("Analyst"))
			emp.insuranceScheme = "Scheme Y";
		else if (emp.salary >= 40000 && emp.designation.equals("Programmer"))
			emp.insuranceScheme = "Scheme Z";
		System.out.println("Employee id=" + emp.Id);
		System.out.println("Employee name=" + emp.name);
		System.out.println("Employee salary=" + emp.salary);
		System.out.println("Employee designation=" + emp.designation);
		System.out.println("Employee Insurance Scheme=" + emp.insuranceScheme);

	}
}

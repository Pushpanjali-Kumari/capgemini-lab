package com.cg.eis.pl;
//Lab 4 Excercise 2
import com.cg.eis.service.Employee_Service_Class;
public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_Service_Class es = new Employee_Service_Class();
		es.getEmployeeDetails();
		es.displayEmployeeDetails();
	}

}

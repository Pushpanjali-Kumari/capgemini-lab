package com.capgemini.lab6;
/**
 * @author Pushpanjali
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise4 {
	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> studentMarksList = new HashMap<String, Integer>();
	static Map<String, String> medalList = new HashMap<String, String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of Students:");
		int n = sc.nextInt();

		String studentRegNo;
		Integer studentMarks;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter Student Registration Number:");
			studentRegNo = sc.next();
			System.out.println("Enter Student Marks:");
			studentMarks = sc.nextInt();
			studentMarksList.put(studentRegNo, studentMarks);
		}

		medalList = getStudents(studentMarksList);

		System.out.println("Student List for Medals:");
		for (Entry<String, String> hashmapdata : medalList.entrySet()) {
			System.out.print(hashmapdata);
			System.out.print(", ");
			System.out.println();
		}
	}
/**
 * 
 * @param studentMarksList2
 * @return the type of medal from the medal list
 */
	private static Map<String, String> getStudents(Map<String, Integer> studentMarksList2) {
		// TODO Auto-generated method stub
		String medal;

		for (String regNo : studentMarksList2.keySet()) {

			Integer marks = studentMarksList2.get(regNo);
			if (marks >= 90) {
				medal = "Gold";
				medalList.put(regNo, medal);
			} else if (marks >= 80 && marks < 90) {
				medal = "Silver";
				medalList.put(regNo, medal);
			} else if (marks >= 70 && marks < 80) {
				medal = "Bronze";
				medalList.put(regNo, medal);
			}
		}
		return medalList;

	}

}

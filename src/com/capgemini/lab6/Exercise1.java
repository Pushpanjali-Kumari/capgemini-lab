package com.capgemini.lab6;

/**
 * @author Pushpanjali
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise1 {
	/**
	 * 
	 * @param keyValue
	 * @return the sorted list
	 */
	public static ArrayList<Integer> getValues(HashMap<String, Integer> keyValue) {
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		valueList.addAll(keyValue.values());
		valueList.sort(null);
		return valueList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pk = new Scanner(System.in);
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		ArrayList<Integer> valueList = new ArrayList<Integer>();
		System.out.println("Enter the no of details to add?:");
		int n = pk.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter Key Value Details for product " + i + 1 + " :");
			System.out.println("Enter product ID as Key:");
			String id = pk.next();
			System.out.println("Enter product price as Value:");
			Integer price = pk.nextInt();
			hMap.put(id, price);
		}

		valueList = getValues(hMap);

		System.out.println();

		for (int val : valueList)
			System.out.println(val);

		pk.close();
	}
}
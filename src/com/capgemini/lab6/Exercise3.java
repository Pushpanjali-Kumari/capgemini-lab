package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {

	public static Map<Integer, Integer> getSquares(int[] array) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], array[i] * array[i]);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the size of the array=");
		int size = pk.nextInt();
		if (size < 1)
			System.out.println("Size  cannot be zero or negative..");
		else {
			int array[] = new int[size];
			for (int i = 0; i < size; i++) {
				System.out.print("Enter Element No." + (i + 1) + " : ");
				array[i] = pk.nextInt();
			}
			Map<Integer, Integer> map = getSquares(array);
			System.out.print("The numbers and their squares are:\n");
			for (Map.Entry<Integer, Integer> m : map.entrySet()) {
				System.out.println("Number : " + m.getKey() + "Square : " + m.getValue());
			}
		}
		pk.close();
	}

}

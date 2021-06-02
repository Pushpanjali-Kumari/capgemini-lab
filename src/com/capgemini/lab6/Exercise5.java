package com.capgemini.lab6;
/**
 * @author Pushpanjali
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = pk.nextInt();
		if (size < 1)
			System.out.println("Size cannot be zero or negative..");
		else {
			int array[] = new int[size];
			for (int i = 0; i < size; i++) {
				System.out.print("Enter Element No." + (i + 1) + " : ");
				array[i] = pk.nextInt();
			}
			System.out.println("The second smallest number in the array is " + getSecondSmallest(array) + ".");
		}
		pk.close();
	}
/**
 * 
 * @param array
 * @return the second smallest in the array list
 */
	public static int getSecondSmallest(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		int secondSmallest = arrayList.get(1);
		for (int i = 1; i < array.length; i++) {
			if (arrayList.get(i) != arrayList.get(i - 1)) {
				secondSmallest = arrayList.get(i);
				break;
			}
		}
		return secondSmallest;
	}

}

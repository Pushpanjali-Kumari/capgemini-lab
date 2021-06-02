package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * @author Pushpanjali
 *
 */
public class Excercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = pk.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("Enter Element No." + (i + 1) + " : ");
			array[i] = pk.nextInt();
		}
		System.out.println("The reversed elements before sorting the array : ");
		for (int i = 0; i < size; i++) {
			System.out.print(reverse(array[i]) + " ");
		}
		System.out.println();
		System.out.println("The reversed elements after sorting the array : ");
		array = getSorted(array);
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		pk.close();
	}

	/**
	 * 
	 * @param number
	 * @return reverse of string
	 */
	public static int reverse(int number) {
		String string = "" + number;
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			rev += string.charAt(i);
		}
		return Integer.parseInt(rev);
	}

	/**
	 * 
	 * @param array
	 * @return the array after reversing and sorting each element
	 */
	public static int[] getSorted(int[] array) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			array[i] = reverse(array[i]);
			arrayList.add(array[i]);
		}
		Collections.sort(arrayList);
		for (int i = 0; i < array.length; i++) {
			array[i] = arrayList.get(i);
		}
		return array;
	}
}

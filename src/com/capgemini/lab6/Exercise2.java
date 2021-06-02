package com.capgemini.lab6;

/**
 * @author Pushpanjali
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter number of characters to enter:");
			int n = pk.nextInt();
			char[] arr = new char[n];

			for (int i = 0; i < n; i++) {
				System.out.println("Enter Character:");
				arr[i] = pk.next().trim().charAt(0);
			}

			charCount = countChars(arr);
			System.out.println();
			displayCount();
		}

		private static void displayCount() {
			// TODO Auto-generated method stub
			System.out.println("Charcater Count:");
			for (Entry<Character, Integer> hashmapdata : charCount.entrySet()) {
				System.out.print(hashmapdata);
				System.out.println();
			}
	}

	static Scanner pk = new Scanner(System.in);
	static Map<Character, Integer> charCount = new HashMap<Character, Integer>();

	static Map<Character, Integer> countChars(char[] arr) {

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (charCount.containsKey(Character.valueOf(c))) {
				charCount.replace(Character.valueOf(c), charCount.get(Character.valueOf(c)) + 1);
			} else {
				charCount.put(Character.valueOf(c), 1);
			}
		}

		return charCount;
	}

	
	}



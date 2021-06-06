package com.capgemini.lab9;
/**
 * @author Pushpanjali
 */
import java.util.Scanner;

public class Exercise2 {
	  public static void main(String[] args) {
		   
			AddSpace s = ()->{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the string: ");
				return sc.next().replace(""," ").trim();
			};
			System.out.println("string with space in between is: "+ s.addSpaceInBetween());
		}
}

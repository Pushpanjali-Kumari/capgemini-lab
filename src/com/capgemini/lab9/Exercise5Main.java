package com.capgemini.lab9;
/**
 * @author Pushpanjali
 */
import java.util.Scanner;

public class Exercise5Main {

		public int factorial(int num) {
			
			int fact = 1;
			if(num == 0 || num == 1) {
				return 1;
			}
			
			for(int i=2; i<=num; i++) {
				fact = fact*i;
			}
			
			return fact;
		}
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc  =new Scanner(System.in);
			
			System.out.println("Enter Number:");
			int n = sc.nextInt();
			
			Exercise5Main e = new Exercise5Main();
			
			Exercise5 e5 = e :: factorial;
			System.out.println("Factorial of "+n+" is: "+e5.fact(n));
			
			sc.close();
		}
	}



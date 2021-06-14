package com.capgemini.lab9;
/**
 * @author Pushpanjali
 */
import java.util.Scanner;

public class NumberCheckMainEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num = sc.nextInt();
		int numToCompare =sc.nextInt();
		NumberCheckEx4 checker1 = new NumberCheckEx4(num);
	        
	        CheckInterfaceEx4 p = NumberCheckEx4::isBigger;
	        boolean result = p.check(checker1,numToCompare);
	        if (result) {
	            System.out.println(checker1.getNum() + " is bigger than " + numToCompare);
	        }else {
	            System.out.println(checker1.getNum() + " is smaller  " + numToCompare);
	        }
	    }
	}



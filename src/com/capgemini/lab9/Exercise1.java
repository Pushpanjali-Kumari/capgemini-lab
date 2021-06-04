package com.capgemini.lab9;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x and y");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Exercise1FuncInterface power = (int x,int y)->{
			System.out.println("x^y="+(Math.pow(x, y)));
		};
		power.power(a, b);
	}
}

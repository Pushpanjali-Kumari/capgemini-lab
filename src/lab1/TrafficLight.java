package lab1;
import java.util.Scanner;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select one of the three lights ");
		System.out.println("1 Red");
		System.out.println("2 Yellow");
		System.out.println("3 Green");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		switch(num) 
		{
		case 1: 
			System.out.println("Stop");
			break;
		case 2:
			System.out.println("Ready");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid Input");
		
		}
		sc.close();

	}
	}

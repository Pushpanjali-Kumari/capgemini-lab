package lab1;
import java.util.Scanner;

public class CubeSum {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int sum = 0, rem;
		while(num > 0) {
			rem = num % 10;
			sum = sum + (rem*rem*rem);
			num = num / 10;
		}
		System.out.println("Sum of the cubes of the digit " + sum);
		sc.close();
	}

}
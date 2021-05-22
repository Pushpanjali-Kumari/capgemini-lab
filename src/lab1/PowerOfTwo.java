package lab1;
import java.util.Scanner;

public class PowerOfTwo{

	public static boolean checkNumber (int n) {
		if(n == 0)
		    return false;
		else
			return (int)(Math.ceil((Math.log(n) / Math.log(2)))) == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check-");
		num = sc.nextInt();
		if(checkNumber(num))
			System.out.println(num + " is power of 2");
		else
			System.out.println(num + " is not power of 2");
		sc.close();
	}

}
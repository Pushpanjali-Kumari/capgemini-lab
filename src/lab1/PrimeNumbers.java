package lab1;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer");
		num = sc.nextInt();
		System.out.println("prime numbers are-");
		for (int i=1; i<=num; i++)
		{
		flag=0;
		for (int x=1; x<=i; x++)
		{
		if (i%x == 0)
		flag++;
		}
		if (flag==2)
		System.out.println (i);
		}
		sc.close();
	}

}


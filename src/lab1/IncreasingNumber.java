package lab1;
import java.util.Scanner;
public class IncreasingNumber {
	public static boolean checkNumber(int number) {
		boolean x = false;
	    int c = number % 10;
	    number = number /10;
	    while(number > 0) {
	    	if(c <= number % 10)
	    	{
	    		x = true;
	            break;
	    	}
	    	c = number % 10;
	        number = number / 10;
	    }
	    return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number-");
	    num = sc.nextInt();
	    if(checkNumber(num))
	    	System.out.println(num + " is an increasing number.");
	    else
	    	System.out.println(num + " is not an increasing number.");
	    sc.close();
	}

}
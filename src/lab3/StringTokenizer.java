<<<<<<< HEAD
package lab2;
=======
package lab3;
>>>>>>> 706caae (message)
import java.util.*;
public class StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sequence of integers = ");
		String digit=sc.nextLine();
		String num[]=digit.split(" ");
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=Integer.parseInt(num[i]);
			if(i<num.length-1)
				System.out.print(num[i]+" + ");
			else
				System.out.print(num[i]+" = ");
		}
		System.out.print(sum);
		sc.close();
	}
}
	
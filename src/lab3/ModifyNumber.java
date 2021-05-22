<<<<<<< HEAD
package lab2;
=======
package lab3;
>>>>>>> 706caae (message)
import java.util.Scanner;
public class ModifyNumber {

	public static int modifyNumber(int num1) {
		String num=""+num1;
		String result="";
		int k=num.length();
		for(int i=0;i<k-1;i++) {
			result=result+Math.abs(((int)num.charAt(i)-48)-((int)num.charAt(i+1)-48));
		}
		result+=num1%10;
		return Integer.parseInt(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter number=");
		int num = sc.nextInt(); 
		System.out.println("Output="+modifyNumber(num));
		sc.close();
	}

}
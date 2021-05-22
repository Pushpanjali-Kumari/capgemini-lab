<<<<<<< HEAD
package lab2;
=======
package lab3;
>>>>>>> 706caae (message)
import java.util.Scanner;
public class PositiveStr {
		public static boolean PositiveString(String s)
		{
			String strng=s.toLowerCase();
			int count=0,k;
			k=strng.length();
			for(int i=0;i<k-1;i++) {
				if(strng.charAt(i)>strng.charAt(i+1)) {
					count=1;
					break;
				}
			}
			if(count==0)
				return true;
			return false;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter the string=");
			String str = sc.next();
			if(PositiveString(str))
				System.out.println(str+" is a positive string");
			else
				System.out.println(str+" is not a positive string");

			sc.close();
		}
	}



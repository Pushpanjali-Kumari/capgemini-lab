<<<<<<< HEAD
package lab2;
=======
package lab3;
>>>>>>> 706caae (message)
import java.util.Scanner;
public class ReplaceConsonants {
	
	public static String alterString(String str1) {
		char ch=' ';
		String w="";
		for(int i=0;i<str1.length();i++) {
			ch=str1.charAt(i);
			if((ch>=65 && ch<=90) && (ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')) {
				ch=(char)((int)ch+1);
			}
			else if((ch>=97 && ch<=122) && (ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')) {
				ch=(char)((int)ch+1);
			}
			w+=ch;
		}
		return w;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String =");
		String str = sc.nextLine(); 
		System.out.print("Altered String is="+alterString(str));
		
		sc.close();
	}
}

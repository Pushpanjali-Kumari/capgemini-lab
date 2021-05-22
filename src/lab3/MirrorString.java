<<<<<<< HEAD
package lab2;
=======
package lab3;
>>>>>>> 706caae (message)
import java.util.Scanner;
public class MirrorString {

	
	  public String getImage(String str)
		   {
			   StringBuffer str1 = new StringBuffer(str);
			   str1.append('|');
			   StringBuffer sb = new StringBuffer(str);
			   sb.reverse();
			   str1.append(sb);
			   return str1.toString(); 
           }
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
		 
		       {
		             MirrorString p =new MirrorString();
		              Scanner s = new Scanner(System.in);
		              System.out.println("Enter a String");
		              String str = s.next();
		              System.out.println(p.getImage(str));
		       }
		}
	}



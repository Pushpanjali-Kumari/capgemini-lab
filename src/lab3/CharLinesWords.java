<<<<<<< HEAD
package lab2;
import java.util.Scanner;
import java.io.*;
public class CharLinesWords {
		// TODO Auto-generated method stub
		public static void main(String[] args)throws IOException
	{
		 int nl=1,nw=0;           
         char ch;
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter File name-");
         String str=sc.nextLine();
         FileInputStream f=new FileInputStream(str);
         int n=f.available();
         for(int i=0;i<n;i++)
         {
                     ch=(char)f.read();
                     if(ch=='\n')
                     nl++;
                     else if(ch==' ')
                                 nw++;
                                                        
         }
         System.out.println("Number of lines : "+nl);
         System.out.println("Number of words : "+(nl+nw));
         System.out.println("Number of characters : "+n);
	}

=======
package lab3;
import java.util.Scanner;
public class CharLinesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string=");
		String str=sc.next();
		int n=str.length();
		int word=1;
		for(int i=0;i<n;++i)
		{
			if(str.charAt(i)==' ');
			word++;
		}

System.out.println("Number of words="+ (word-1));
	}
>>>>>>> 706caae (message)

	}


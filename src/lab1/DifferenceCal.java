package lab1;
import java.util.Scanner;
public class DifferenceCal {
	int calculateDifference(int n)
	  {
		  int i,sum=0,sum1=0,sum2=0;
		  for(i=1;i<=n;i++)
		  {
			  sum1=sum1+(i*i);
			  sum2=sum2+i;
			  sum=(sum2*sum2)-sum1;
		  }
		  return sum;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want difference to be calculated-");
		int n=sc.nextInt();
		DifferenceCal num=new DifferenceCal();
		System.out.println("difference="+num.calculateDifference(n));
	sc.close();
	}
	}


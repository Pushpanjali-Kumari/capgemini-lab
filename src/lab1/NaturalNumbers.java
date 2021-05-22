package lab1;
import java.util.Scanner;
public class NaturalNumbers {
	 int calculateSum(int n)
	    {
	    	int i,sum=0;
	    	for(i=1;i<=n;i++)
	    	{
	    		if(i%3==0 || i%5==0)
	    		{
	    			sum=sum+i;
	    		}
	    	}
	    	return sum;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number upto which you want the sum");
		int n=sc.nextInt();
		NaturalNumbers num=new NaturalNumbers();
		System.out.println("sum="+num.calculateSum(n));
		sc.close();
	}
	}


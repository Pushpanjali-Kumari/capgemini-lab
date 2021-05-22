package lab1;
import java.util.Scanner;
public class FibonacciSeries {
	
	static int recFibonacci(int n) {
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		else 		
			return (recFibonacci(n-2) + recFibonacci(n-1));
	}
	static int nonRecFibonacci(int n) {
		if(n==0 || n==1) 
			return n;
		else {
			int n1=0,n2=1;
			int n3=0,i;    
			System.out.print(n1+" "+n2);   
			    
			 for(i=1;i<n;++i)    
			 {    
			  n3=n1+n2;    
			  n1=n2;    
			  n2=n3;
		}
			 return n3;
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number-");
		int num = sc.nextInt();
		System.out.println("The nth value of the Fibonacci sequence is- \n" + recFibonacci(num));
		System.out.println("The nth value of the Fibonacci sequence is- \n" + nonRecFibonacci(num));
		sc.close();
	}
	}


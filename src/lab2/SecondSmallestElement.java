package lab2;
import java.util.*;
public class SecondSmallestElement {
	
	 static int getSecondSmallest(int arr[],int n1)
	 {
		 int i,j,temp;
		 n1=arr.length;
		 for(i=0;i<n1;i++) {
			 for(j=0;j<n1;j++)
			 {
				 if(arr[i]<arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 return arr[1];
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int i;
		System.out.println("Enter the no. of elements=");	
		int num=sc.nextInt();
		int n[]=new int[num];
		System.out.println("enter the elements of array:-");
		for(i=0;i<num;i++)
		{
			n[i] = sc.nextInt();
		}
		SecondSmallestElement  num1= new SecondSmallestElement();
		num1.getSecondSmallest(n,num);
		System.out.println("Second Smallest element: "+n[1]);
		sc.close();
	}

}

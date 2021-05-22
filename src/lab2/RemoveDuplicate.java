package lab2;
import java.util.Scanner;
public class RemoveDuplicate {
		public static int RemoveDuplicateElement(int arr[]){  
			int n=arr.length;
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int tmp;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(arr[j]<arr[j+1]) {
						tmp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=tmp;
					}
				}
			}
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];      
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
		
		
		public static int[] modifyArray(int[] arr) {
			int n=arr.length;
			int tmp;
			for(int i=0;i<n;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(arr[j]<arr[j+1]) {
						tmp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=tmp;
					}
				}
			}
			
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     

	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return temp;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter the size of the array= ");
			int size=sc.nextInt();
			int array[]=new int[size];
			for(int i=0;i<size;i++) {
				System.out.print("Enter Element "+(i+1)+" = "); 
				array[i]=sc.nextInt();
			}
			
			int k=RemoveDuplicateElement(array);
			array=modifyArray(array);
			System.out.println("The array after removing duplicates and sorting in descending order= ");
			for(int i=0;i<k;i++) {
				System.out.print(array[i]+" ");
			}
			
			sc.close();
		}

	}
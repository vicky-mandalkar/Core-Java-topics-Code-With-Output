
import java.util.Scanner;

class AverageofArrayElements{

//enter  input element in array 
	 
	static void inputArray(int arr[],Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+ i +" Array Element  : ");
			arr[i]=sc.nextInt();
		}
	} 


//array element are showing 
	
	static void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index  "+ i +" Element is : "+ arr[i]);
		}
	}

// Average of Array Elements
	static int sum=0;
	static void Average(int arr[]){
		for(int i=arr.length-1;i>=0;i--){
			sum=sum+arr[i];
		}

		System.out.println("Sum Of array is : "+sum);
		double avg=(sum/arr.length);
		System.out.println("Average Of array is : "+avg);
		
	}


	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("===========INPUT ELEMENT =================");
		inputArray(arr,sc);
		System.out.println("============= Print Element ===============");
		print(arr);
		System.out.println("============= Average of all Element ===============");
		Average(arr);

			
	}
}
/*
Enter Array Size :
5
===========INPUT ELEMENT =================
Enter 0 Array Element  :
10
Enter 1 Array Element  :
20
Enter 2 Array Element  :
30
Enter 3 Array Element  :
40
Enter 4 Array Element  :
50
============= Print Element ===============
Index  0 Element is : 10
Index  1 Element is : 20
Index  2 Element is : 30
Index  3 Element is : 40
Index  4 Element is : 50
============= Average of all Element ===============
Sum Of array is : 150
Average Of array is : 30.0
*/
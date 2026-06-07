/* 
Array Case 4: Sum of Odd Elements
 
From a given array, calculate the sum of all odd elements only.
 
Example Input:
Array = [11, 22, 33, 44, 55]
 
Expected Output:
Odd elements = 11, 33, 55
Sum = 99
*/

import java.util.Scanner;
class SumofOddElements{

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

// Sum of Odd Elements
	static int sum=0;
	static void sumOdd(int arr[]){
		for(int i=0; i<arr.length;i++){
			if(arr[i]%2 != 0){
				System.out.print(arr[i] +" ");
				sum=sum+arr[i];
			}
		}
		System.out.println();
		System.out.println("Sum Of  Odd ELement : "+sum);
				
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
		System.out.println("============= Sum Of Odd Element ===============");
		System.out.print(" Odd Element : ");
		sumOdd(arr);

			
	}
}
/*
Enter Array Size :
5
===========INPUT ELEMENT =================
Enter 0 Array Element  :
11
Enter 1 Array Element  :
12
Enter 2 Array Element  :
13
Enter 3 Array Element  :
14
Enter 4 Array Element  :
15
============= Print Element ===============
Index  0 Element is : 11
Index  1 Element is : 12
Index  2 Element is : 13
Index  3 Element is : 14
Index  4 Element is : 15
============= Sum Of Odd Element ===============
 Odd Element : 11 13 15
Sum Of  Odd ELement : 39
*/
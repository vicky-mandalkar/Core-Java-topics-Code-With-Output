// Array Case 13: Reverse Array (Without Third Variable)
// Write a program to reverse all elements of an array without using a third variable.
// Example Input:
// Array = [5, 10, 15, 20, 25]
// Expected Output:
// Before Reverse: [5, 10, 15, 20, 25]
// After Reverse:  [25, 20, 15, 10, 5]

import java.util.Scanner;
class ReverseArray{

	public static void Input(int arr[],Scanner sc){
		System.out.println("======== Enter array Element ========");
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Index "+i+" Element : ");
			arr[i]=sc.nextInt();
		}
	}

	public static void PrintElement(int arr[]){
		System.out.println("======== ARRAY ELEMENT ========");
		for(int i=0;i<arr.length;i++){
			System.out.println("Index "+i+" Element is "+arr[i]);
		}
	}
	
	public static void Reverse(int arr[]){
		int i=0;
		int j=arr.length-1;
		//10 20 30 40 50 
		while(i<j){
			arr[i]=arr[i]+arr[j];//0+50=50 |
			arr[j]=arr[i]-arr[j];//50-50=0 |
			arr[i]=arr[i]-arr[j];//
			i++;
			j--;
		}		
	}

	public static void AfterReverse(int arr[]){
		System.out.println("======== AFTER REVERSE ========");
		for(int i=0;i<arr.length;i++){
			System.out.println("Index "+i+" Element is "+arr[i]);
		}
	}

//---------------------------Main------------------------- 
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		Input(arr,sc);
		PrintElement(arr);
		Reverse(arr);
		AfterReverse(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
10
Enter Index 1 Element :
20
Enter Index 2 Element :
30
Enter Index 3 Element :
40
Enter Index 4 Element :
50
======== ARRAY ELEMENT ========
Index 0 Element is 10
Index 1 Element is 20
Index 2 Element is 30
Index 3 Element is 40
Index 4 Element is 50
======== AFTER REVERSE ========
Index 0 Element is 50
Index 1 Element is 40
Index 2 Element is 30
Index 3 Element is 20
Index 4 Element is 10
*/
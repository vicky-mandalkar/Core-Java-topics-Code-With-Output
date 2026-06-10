/*
Array Case 14: Maximum Element
 
Write a program to find the maximum element in an array.
 
Example Input:
Array = [12, 45, 67, 23, 89, 34]
 
Expected Output:
Maximum Element = 89
*/

import java.util.Scanner;
class MaximumElement{

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


	public static void Maximun(int arr[]){
		System.out.println("======== MAXIMUM ELEMENT ========");
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}			
		}
		System.out.println("Maximum Element at Index  is  : "+max);
	}

//---------------------------Main------------------------- 
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		Input(arr,sc);
		PrintElement(arr);
		Maximun(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
65
Enter Index 1 Element :
1
Enter Index 2 Element :
45
Enter Index 3 Element :
87
Enter Index 4 Element :
23
======== ARRAY ELEMENT ========
Index 0 Element is 65
Index 1 Element is 1
Index 2 Element is 45
Index 3 Element is 87
Index 4 Element is 23
======== MAXIMUM ELEMENT ========
Maximum Element at Index  is  : 87
*/

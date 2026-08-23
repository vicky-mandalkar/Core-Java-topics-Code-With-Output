/*
Array Case 15: Second Maximum Element
 
Write a program to find the second largest element in an array.
 
Example Input:
Array = [15, 72, 48, 96, 33, 81]
 
Expected Output:
Second Maximum Element = 81

*/

import java.util.Scanner;
class SecondMaximumElement{

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


	public static void SecondMaximun(int arr[]){
		System.out.println("======== MAXIMUM ELEMENT ========");
		int max=arr[0];
		int SecMax=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				SecMax=max;
				max=arr[i];
			}else if(arr[i]>SecMax && arr[i] != max){
				SecMax=arr[i];
			}			
		}
		System.out.println(" Second Maximum Element at Index  is  : "+SecMax);
	}

//---------------------------Main------------------------- 
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		
		Input(arr,sc);
		PrintElement(arr);
		SecondMaximun(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
12
Enter Index 1 Element :
23
Enter Index 2 Element :
45
Enter Index 3 Element :
15
Enter Index 4 Element :
56
======== ARRAY ELEMENT ========
Index 0 Element is 12
Index 1 Element is 23
Index 2 Element is 45
Index 3 Element is 15
Index 4 Element is 56
======== MAXIMUM ELEMENT ========
 Second Maximum Element at Index  is  : 45
*/
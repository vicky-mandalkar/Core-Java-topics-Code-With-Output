/*
Array Case 30: Find Adjacent Values
 
Write a program to find the absolute difference between each element of the array and its next adjacent element.
Store and display all these differences in a new array.
 
Example Input:
Array = [15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46]
 
Expected Output:
Differences = [8, 5, 8, 46, 36, 13, 11, 22, 43, 5, 24]

*/

import java.util.Scanner;
class FindDifferenceBetweenTwoElement{

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


	public static void Differences(int arr[]){
		//======== Find Adjacent Values =======
		for(int i = 0; i < arr.length - 1; i++) {

    			int diff = arr[i] - arr[i + 1];

    			if(diff < 0) {
        			diff = diff * -1;
    			}

    			arr[i]=diff;
		}
		
	}

	public static void PrintDifferences(int arr[]){
		System.out.println("======== Find Adjacent Values ( DIFFERENCE )  ========");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");			
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
		Differences(arr);
		PrintDifferences(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
12
Enter Index 1 Element :
2
Enter Index 2 Element :
10
Enter Index 3 Element :
20
Enter Index 4 Element :
36
======== ARRAY ELEMENT ========
Index 0 Element is 12
Index 1 Element is 2
Index 2 Element is 10
Index 3 Element is 20
Index 4 Element is 36
======== Find Adjacent Values ( DIFFERENCE )  ========
10      8       10      16      36
*/

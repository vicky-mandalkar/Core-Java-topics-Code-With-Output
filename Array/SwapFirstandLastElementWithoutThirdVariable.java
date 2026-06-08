/*
 Array Case 10: Swap First and Last Element (Without Third Variable)
 Write a program to swap the first element and the last element of an array without using a third (temporary) variable.
 Example Input:
Array = [7, 14, 21, 28, 35]
 Expected Output:
Before Swap: [7, 14, 21, 28, 35]
After Swap:  [35, 14, 21, 28, 7]
*/


import java.util.Scanner;
class SwapFirstandLastElementWithoutThirdVariable{
	static void InputElement(int arr[], Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+i+"th Element : ");
			arr[i]=sc.nextInt();
		}
	}
	static void PrintElement(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index "+i+"th  Element is : "+arr[i]);
		}
	}
	static void SwapFirstToLast(int arr[]){
	  	int last = arr.length - 1;
       		
        	arr[0] = arr[0] + arr[last];
        	arr[last] = arr[0] - arr[last];
        	arr[0] = arr[0] - arr[last];
        
		System.out.println("After Swap:");
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	
	}


	public static void  main(String args[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("=========INPUTELEMENT==============");
		InputElement(arr, sc);
		System.out.println("=========PRINT ELEMENT============");
		PrintElement(arr);
		System.out.println("=========FIRST ELEMENT Swap TO LAST=======");
		SwapFirstToLast(arr);
	
	}
}
/*
Enter Array Size :
5
=========INPUTELEMENT==============
Enter 0th Element :
10
Enter 1th Element :
20
Enter 2th Element :
30
Enter 3th Element :
40
Enter 4th Element :
50
=========PRINT ELEMENT============
Index 0th  Element is : 10
Index 1th  Element is : 20
Index 2th  Element is : 30
Index 3th  Element is : 40
Index 4th  Element is : 50
=========FIRST ELEMENT Swap TO LAST=======
After Swap:
50 20 30 40 10
*/

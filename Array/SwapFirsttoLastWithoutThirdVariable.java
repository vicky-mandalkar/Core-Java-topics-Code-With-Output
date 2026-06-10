/*
 Array Case 11: Shift First to Last (Without Third Variable)
 
Write a program to move the first element of the array to the last position (shift left by one) without using a third variable.
 
Example Input:
Array = [1, 2, 3, 4, 5]
 
Expected Output:
Before Shift: [1, 2, 3, 4, 5]
After Shift:  [2, 3, 4, 5, 1]

*/


import java.util.Scanner;
class SwapFirsttoLastWithoutThirdVariable{
	
	//Input Element
	static void InputElement(int arr[], Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+i+"th Element : ");
			arr[i]=sc.nextInt();
		}
	}

	//Print Element
	static void PrintElement(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index "+i+"th  Element is : "+arr[i]);
		}
	}

	//
	static void SwapFirstToLast(int arr[]){

		//System.out.println("Swap Element");
		int first=arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		    //System.out.print(arr[i]+" ");
		}
		arr[arr.length - 1] = first;
		PrintAfterSwap(arr);
	
	}

	static void PrintAfterSwap(int arr[]){

		System.out.println(" Aftar Swap Element");
		
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
		System.out.println("=========Shift First to Last =======");
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
=========Shift First to Last =======
 Aftar Swap Element
20 30 40 50 10
*/

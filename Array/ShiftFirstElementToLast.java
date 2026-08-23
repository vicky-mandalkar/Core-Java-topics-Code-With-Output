/*
Array Case 7: Shift First Element to Last

WAP to shift first element to last from array
 
Example Input:
input: {10,20,30,40,50}
output:{20,30,40,50,10}
*/

import java.util.Scanner;
class ShiftFirstElementToLast{

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
	
	static void FirstToLast(int arr[]){
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length - 1]=temp;
		System.out.println("OUTPUT ====>");

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
		System.out.println("=========FIRST ELEMENT SHOFT TO LAST=======");
		FirstToLast(arr);
	
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
=========FIRST ELEMENT SHOFT TO LAST=======
OUTPUT ====>
20 30 40 50 10
*/
<<<<<<< HEAD
/*
Array Case 18: Replace Each Element with First Digit
 
WAP to replace each elements with their first digit of element
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
Output:{1,2,6,3,6,2,2,3,6,3}
*/

// class Replace {
//     public static void main(String args[]) {
//         int arr[] = {24, 235, 6754, 3257, 64, 2367, 288, 35, 645, 374};
//         for(int i = 0; i < arr.length; i++) {
//             while(arr[i] >= 10 ) {
//                 arr[i] = arr[i] / 10;
//             }
//         }
//         System.out.println("Output:");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.Scanner;
class ReplaceEachElementWithFirstDigit{

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


	public static void ReplaceEach(int arr[]){
		//======== Replace Each Element with First Digit ========");
		for(int i=0;i<arr.length;i++){
			while(arr[i]>10){
				arr[i]=arr[i]/10;
			}			
		}
		
	}

	public static void AftarReplace(int arr[]){
		System.out.println("======== AFTER REPLACE ELEMENT WITH FIRST ========");
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
		ReplaceEach(arr);
		AftarReplace(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
123
Enter Index 1 Element :
456
Enter Index 2 Element :
789
Enter Index 3 Element :
963
Enter Index 4 Element :
852
======== ARRAY ELEMENT ========
Index 0 Element is 123s
Index 1 Element is 456
Index 2 Element is 789
Index 3 Element is 963
Index 4 Element is 852
======== AFTER REPLACE ELEMENT WITH FIRST ========
1       4       7       9       8
*/
=======
/*
Array Case 18: Replace Each Element with First Digit
 
WAP to replace each elements with their first digit of element
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
Output:{1,2,6,3,6,2,2,3,6,3}
*/

// class Replace {
//     public static void main(String args[]) {
//         int arr[] = {24, 235, 6754, 3257, 64, 2367, 288, 35, 645, 374};
//         for(int i = 0; i < arr.length; i++) {
//             while(arr[i] >= 10 ) {
//                 arr[i] = arr[i] / 10;
//             }
//         }
//         System.out.println("Output:");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.Scanner;
class ReplaceEachElementWithFirstDigit{

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


	public static void ReplaceEach(int arr[]){
		//======== Replace Each Element with First Digit ========");
		for(int i=0;i<arr.length;i++){
			while(arr[i]>10){
				arr[i]=arr[i]/10;
			}			
		}
		
	}

	public static void AftarReplace(int arr[]){
		System.out.println("======== AFTER REPLACE ELEMENT WITH FIRST ========");
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
		ReplaceEach(arr);
		AftarReplace(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
123
Enter Index 1 Element :
456
Enter Index 2 Element :
789
Enter Index 3 Element :
963
Enter Index 4 Element :
852
======== ARRAY ELEMENT ========
Index 0 Element is 123
Index 1 Element is 456
Index 2 Element is 789
Index 3 Element is 963
Index 4 Element is 852
======== AFTER REPLACE ELEMENT WITH FIRST ========
1       4       7       9       8
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a

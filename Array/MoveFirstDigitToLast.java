/*
Array Case 20: Move First Digit to Last
WAP to replace first digit at last of element.
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{231,352,7546,2573,46,3672,882,53,456,743}
*/

// class MoveFirstDigitToLast {
//  	public static void main(String args[]) {
//         	int arr[] = {123,235,6754,3257,64,2367,288,35,645,374};
//         	for(int i = 0; i < arr.length; i++) {
// 			int num=arr[i];
// 			int first=num;
// 			while(first >= 10){
// 				first=first/10;
// 			}
// 			int pow=1;
// 			int temp=num;
// 			while(temp>=10){
// 				pow=pow*10;
// 				temp=temp/10;
// 			}			
// 			int rem=num%pow;
// 			arr[i]=rem*10+first;
// 		}
// 		System.out.println("Output:");
//         	for(int i = 0; i < arr.length; i++){
//             		System.out.print(arr[i] + " ");
//         	} 
//   	}
// }

import java.util.Scanner;
class MoveFirstDigitToLast{

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


	public static void MoveDigit(int arr[]){
		//======== Replace Each Element with First Digit ========");
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			int first=num;
			while(first>=10){
				first=first/10;
			}
			int pow=1;
			int temp=num;
			while(temp>=10){
				pow=pow*10;
				temp=temp/10;
			}
			
			int rem=num%pow;
			arr[i]=rem*10+first;
			//System.out.print(arr[i]+"\t");
						
		}
		
	}

	public static void PrintDigit(int arr[]){
		System.out.println("======== AFTER  Move First Digit to Last ========");
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
		MoveDigit(arr);
		PrintDigit(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
7423
Enter Index 1 Element :
7963
Enter Index 2 Element :
852
Enter Index 3 Element :
7412
Enter Index 4 Element :
12
======== ARRAY ELEMENT ========
Index 0 Element is 7423
Index 1 Element is 7963
Index 2 Element is 852
Index 3 Element is 7412
Index 4 Element is 12
======== AFTER  Move First Digit to Last ========
4237    9637    528     4127    21
*/
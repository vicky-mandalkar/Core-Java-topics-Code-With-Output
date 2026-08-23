/*
Array Case 19: Replace Each Element with First and Last Digit
 
WAP to replace each elements with their first and last element
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{13,25,64,37,64,27,28,35,65,34}
*/

// class ReplaceEachElementWithFirstAndLastDigit{
//     public static void main(String args[]) {
//         int arr[]= {123,235,6754,3257,64,2367,288,35,645,374};
//         //output:{13,25,64,37,64,27,28,35,65,34};
//         for(int i = 0; i < arr.length; i++) {
//             int last=arr[i]%10;
//             while(arr[i]>10){
//                 arr[i]=arr[i]/10;
//             }
//             int first=arr[i];
//             arr[i]=((10*first)+last);
//         }
//         System.out.println("Output:");
//         for(int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

import java.util.Scanner;
class ReplaceEachElementWithFirstAndLastDigit{

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
			int last=arr[i]%10;
			while(arr[i]>10){
				arr[i]=arr[i]/10;
			}
			int first=arr[i];
			arr[i]=((first*10)+last);			
		}
		
	}

	public static void AftarReplace(int arr[]){
		System.out.println("======== AFTER  Replace Each Element with First and Last Digit ========");
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
125
Enter Index 1 Element :
96248
Enter Index 2 Element :
456
Enter Index 3 Element :
126
Enter Index 4 Element :
78963
======== ARRAY ELEMENT ========
Index 0 Element is 125
Index 1 Element is 96248
Index 2 Element is 456
Index 3 Element is 126
Index 4 Element is 78963
======== AFTER  Replace Each Element with First and Last Digit ========
15      98      46      16      73
*/

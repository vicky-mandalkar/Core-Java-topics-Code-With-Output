/*
Array Case 21: Move Last Digit to First (Each Element)
 
WAP to shift last digit to first from each elements
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{312,523,4675,7325,46,7236,828,53,564,437}
*/

/*
 class MoveLastDigitToFirst{
  	public static void main(String args[]) {
         	int arr[] = {123,235,6754,3257,64,2367,288,35,645,374};         			for(int i = 0; i < arr.length; i++) {
 			int num=arr[i];
			int last=arr[i]%10;
			int rem=num/10;

			int pow=1;
			int temp=rem;

			while(temp > 0){
				pow=pow*10;
				temp=temp/10;
			}
			arr[i]=last*pow+rem;
			System.out.print(arr[i]+"\t");
         	} 
   	}
}
*/

import java.util.Scanner;
class MoveLastDigitToFirst{

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
		//======== Move Last Digit to First ========");
		for(int i = 0; i < arr.length; i++) {
 			int num=arr[i];
			int last=arr[i]%10;
			int rem=num/10;

			int pow=1;
			int temp=rem;

			while(temp > 0){
				pow=pow*10;
				temp=temp/10;
			}
			arr[i] = last * pow + rem;
		
         	} 
		
	}

	public static void PrintDigit(int arr[]){
		System.out.println("======== AFTER  Move Last Digit to First ========");
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
7412
Enter Index 1 Element :
963
Enter Index 2 Element :
456
Enter Index 3 Element :
789
Enter Index 4 Element :
852
======== ARRAY ELEMENT ========
Index 0 Element is 7412
Index 1 Element is 963
Index 2 Element is 456
Index 3 Element is 789
Index 4 Element is 852
======== AFTER  Move Last Digit to First ========
2741    396     645     978     285
*/
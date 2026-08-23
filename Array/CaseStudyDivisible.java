/*
Array Case 28: Case Study (Divisible by 4 and/or 5)

WAP to solve following case study
consider black number, which is divisible by 4.
consider white number, which is divisible by 5.
consider grey number, which is both black & white
replace black number with -1.
replace white number with -2.
replace grey number with -3. 
Example Input:
input: {10,14,24,12,18,26,20,23,22,15,26}

Expected Output:
output:{-2,14,-1,-1,18,26,-3,23,22,-2,26}
*/

import java.util.Scanner;
class CaseStudyDivisible{

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


	public static void Divisible(int arr[]){
		//======== Case Study (Divisible by 4 and/or 5) =======
        	for(int i = 0; i < arr.length; i++) {

            		if(arr[i] % 4 == 0 && arr[i] % 5 == 0) {
                		arr[i] = -3;
            		}
            		else if(arr[i] % 4 == 0) {
                		arr[i] = -1;
            		}
            		else if(arr[i] % 5 == 0) {
                		arr[i] = -2;
            		}
        	}
		
	}

	public static void PrintDivisible(int arr[]){
		System.out.println("======== Case Study (Divisible by 4 and/or 5)  ========");
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
		Divisible(arr);
		PrintDivisible(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
12
Enter Index 1 Element :
25
Enter Index 2 Element :
20
Enter Index 3 Element :
13
Enter Index 4 Element :
45
======== ARRAY ELEMENT ========
Index 0 Element is 12
Index 1 Element is 25
Index 2 Element is 20
Index 3 Element is 13
Index 4 Element is 45
======== Case Study (Divisible by 4 and/or 5)  ========
-1      -2      -3      13      -2
*/

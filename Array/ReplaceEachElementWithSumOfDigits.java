/*
Array Case 23: Replace Each Element with Sum of Digits
 
WAP to replace each elements with their sum of digit
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output: {6, 10, 22, 17, 10, 18, 18, 8, 15, 14, 11}
*/

// class Main {
//     public static void main(String[] args) {
//         int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};
//         for(int i=0;i<arr.length;i++){
//             int sum=0;
//             while(arr[i]>0){
//                 int rem=arr[i]%10;
//                 sum=sum+rem;
//                 arr[i]=arr[i]/10;
//             }
//             arr[i]=sum;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         System.out.println("Start small. Ship something.");
//     }
// }


import java.util.Scanner;
class ReplaceEachElementWithSumOfDigits{

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


	public static void Sum(int arr[]){
		//======== Replace Each Element with Sum of Digits=======
		for(int i = 0; i < arr.length; i++) {
 			int sum=0;
            		while(arr[i]>0){
                		int rem=arr[i]%10;
                		sum=sum+rem;
                		arr[i]=arr[i]/10;
            		}
            		arr[i]=sum;
         	} 
		
	}

	public static void PrintSum(int arr[]){
		System.out.println("======== AFTER Replace Each Element with Sum of Digits ========");
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
		Sum(arr);
		PrintSum(arr);

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
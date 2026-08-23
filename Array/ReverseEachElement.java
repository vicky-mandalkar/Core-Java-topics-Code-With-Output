/*
Array Case 25: Reverse Each Element
 WAP to reverse each element from array
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output:{321,532,4576,7523,46,7632,882,53,546,473,65}
 
*/

//class Reverse {
//     public static void main(String[] args) {
//         int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};
//         for(int i=0;i<arr.length;i++){
//             int rev=0;
//             while(arr[i]>0){
//                 int rem=arr[i]%10;
//                 rev=rev*10+rem;
//                 arr[i]=arr[i]/10;
//             }
//             arr[i]=rev;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         System.out.println("Start small. Ship something.");
//     }
// }


import java.util.Scanner;
class ReverseEachElement{

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


	public static void Reverse(int arr[]){
		//======== Reverse Each Element =======
		for(int i = 0; i < arr.length; i++) {
 			int rev=0;
            		while(arr[i]>0){
                		int rem=arr[i]%10;
                		rev=rev*10+rem;
                		arr[i]=arr[i]/10;
            		}
            		arr[i]=rev;
         	} 
		
	}

	public static void PrintReverse(int arr[]){
		System.out.println("======== AFTER Reverse Each Element ========");
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
		Reverse(arr);
		PrintReverse(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
963
Enter Index 1 Element :
852
Enter Index 2 Element :
12
Enter Index 3 Element :
56
Enter Index 4 Element :
85
======== ARRAY ELEMENT ========
Index 0 Element is 963
Index 1 Element is 852
Index 2 Element is 12
Index 3 Element is 56
Index 4 Element is 85
======== AFTER Reverse Each Element ========
369     258     21      65      58
*/

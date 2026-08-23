<<<<<<< HEAD
/*
Array Case 16: Find Pair with Given Sum
 
Write a program to find all pairs of two elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [4, 8, 12, 16]
Target Sum = 20
 
Expected Output:
Pairs with sum 20:
(4, 16)
(8, 12)
*/

// class FindPairWithGivenSum{
// 	public static void main(String ar[]){
// 		int arr[]={10,20,30,40,50};
// 		int target=90;	
// 		for(int i=0;i<arr.length;i++){
// 			for(int j=i+1;j<arr.length;j++){
// 				if(arr[i]+arr[j]==target){
// 					System.out.println("Your target is : "+target+" and Index is : ("+i+" , "+j+")");
// 				}
// 			}
// 		}
// 	}
// }

import java.util.Scanner;
class FindPairWithGivenSum{

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
	

	public static int InputTarget(Scanner sc){
		System.out.println("-------------------------");
    		System.out.println("Enter your Target Element : ");
    		return sc.nextInt();
	}


	public static void FindTarget(int arr[],int target){
		boolean found = false;
		System.out.println("======YOUR OUTPUT========");	
		for(int i=0;i<arr.length;i++){
 			for(int j=i+1;j<arr.length;j++){
 				if(arr[i]+arr[j]==target){
					found = true;
					//System.out.println("(" + arr[i] + ", " + arr[j] + ")");
					System.out.println("Your target is : "+target+" and Index is : ("+i+" , "+j+")");
 				}
 			}
 		}
		if(!found){
			System.out.println("Your element is not present");
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
		int target=InputTarget(sc);
		FindTarget(arr,target);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
1
Enter Index 1 Element :
2
Enter Index 2 Element :
3
Enter Index 3 Element :
4
Enter Index 4 Element :
5
======== ARRAY ELEMENT ========
Index 0 Element is 1
Index 1 Element is 2
Index 2 Element is 3
Index 3 Element is 4
Index 4 Element is 5
-------------------------
Enter your Target Element :
5
======YOUR OUTPUT========
Your target is : 5 and Index is : (0 , 3)
Your target is : 5 and Index is : (1 , 2)
=======
/*
Array Case 16: Find Pair with Given Sum
 
Write a program to find all pairs of two elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [4, 8, 12, 16]
Target Sum = 20
 
Expected Output:
Pairs with sum 20:
(4, 16)
(8, 12)
*/

// class FindPairWithGivenSum{
// 	public static void main(String ar[]){
// 		int arr[]={10,20,30,40,50};
// 		int target=90;	
// 		for(int i=0;i<arr.length;i++){
// 			for(int j=i+1;j<arr.length;j++){
// 				if(arr[i]+arr[j]==target){
// 					System.out.println("Your target is : "+target+" and Index is : ("+i+" , "+j+")");
// 				}
// 			}
// 		}
// 	}
// }

import java.util.Scanner;
class FindPairWithGivenSum{

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
	

	public static int InputTarget(Scanner sc){
		System.out.println("-------------------------");
    		System.out.println("Enter your Target Element : ");
    		return sc.nextInt();
	}


	public static void FindTarget(int arr[],int target){
		boolean found = false;
		System.out.println("======YOUR OUTPUT========");	
		for(int i=0;i<arr.length;i++){
 			for(int j=i+1;j<arr.length;j++){
 				if(arr[i]+arr[j]==target){
					found = true;
					//System.out.println("(" + arr[i] + ", " + arr[j] + ")");
					System.out.println("Your target is : "+target+" and Index is : ("+i+" , "+j+")");
 				}
 			}
 		}
		if(!found){
			System.out.println("Your element is not present");
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
		int target=InputTarget(sc);
		FindTarget(arr,target);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
1
Enter Index 1 Element :
2
Enter Index 2 Element :
3
Enter Index 3 Element :
4
Enter Index 4 Element :
5
======== ARRAY ELEMENT ========
Index 0 Element is 1
Index 1 Element is 2
Index 2 Element is 3
Index 3 Element is 4
Index 4 Element is 5
-------------------------
Enter your Target Element :
5
======YOUR OUTPUT========
Your target is : 5 and Index is : (0 , 3)
Your target is : 5 and Index is : (1 , 2)
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a
*/
<<<<<<< HEAD
/*
Array Case 17: Find Triplet with Given Sum
Write a program to find all triplets of three elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [3, 10, 20, 10, 10]
Target Sum = 30
 
Expected Output:
Triplets with sum 30:
(3, 12, 15)
(6, 9, 15)
*/

 //class FindTripletWithGivenSum{
//  	public static void main(String ar[]){
//  		int arr[]={3,10,20,10,10};
//  		int target=33;	
//  		for(int i=0;i<arr.length;i++){//3,10
//  			for(int j=i+1;j<arr.length;j++){//10,
// 				for(int k=j+1;k<arr.length;k++){//20
// 					if(arr[i]+arr[j]+arr[k]==target){
//  						System.out.println("Your target is : "+target+" and Index is : ( "+i+" , "+j+" , "+k+" )");
//  					}
// 				}				
//  			}
//  		}
//  	}
//  }

import java.util.Scanner;
class FindTripletWithGivenSum{

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
 				 for(int k=j+1;k<arr.length;k++){//20
					if(arr[i]+arr[j]+arr[k]==target){
						found=true;
 						System.out.println("Your target is : "+target+" and Index is : ( "+i+" , "+j+" , "+k+" )");
 					}
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
6
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
Enter Index 5 Element :
6
======== ARRAY ELEMENT ========
Index 0 Element is 1
Index 1 Element is 2
Index 2 Element is 3
Index 3 Element is 4
Index 4 Element is 5
Index 5 Element is 6
-------------------------
Enter your Target Element :
12
======YOUR OUTPUT========
Your target is : 12 and Index is : ( 0 , 4 , 5 )
Your target is : 12 and Index is : ( 1 , 3 , 5 )
Your target is : 12 and Index is : ( 2 , 3 , 4 )
*/
=======
/*
Array Case 17: Find Triplet with Given Sum
Write a program to find all triplets of three elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [3, 10, 20, 10, 10]
Target Sum = 30
 
Expected Output:
Triplets with sum 30:
(3, 12, 15)
(6, 9, 15)
*/

 //class FindTripletWithGivenSum{
//  	public static void main(String ar[]){
//  		int arr[]={3,10,20,10,10};
//  		int target=33;	
//  		for(int i=0;i<arr.length;i++){//3,10
//  			for(int j=i+1;j<arr.length;j++){//10,
// 				for(int k=j+1;k<arr.length;k++){//20
// 					if(arr[i]+arr[j]+arr[k]==target){
//  						System.out.println("Your target is : "+target+" and Index is : ( "+i+" , "+j+" , "+k+" )");
//  					}
// 				}				
//  			}
//  		}
//  	}
//  }

import java.util.Scanner;
class FindTripletWithGivenSum{

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
 				 for(int k=j+1;k<arr.length;k++){//20
					if(arr[i]+arr[j]+arr[k]==target){
						found=true;
 						System.out.println("Your target is : "+target+" and Index is : ( "+i+" , "+j+" , "+k+" )");
 					}
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
6
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
Enter Index 5 Element :
6
======== ARRAY ELEMENT ========
Index 0 Element is 1
Index 1 Element is 2
Index 2 Element is 3
Index 3 Element is 4
Index 4 Element is 5
Index 5 Element is 6
-------------------------
Enter your Target Element :
12
======YOUR OUTPUT========
Your target is : 12 and Index is : ( 0 , 4 , 5 )
Your target is : 12 and Index is : ( 1 , 3 , 5 )
Your target is : 12 and Index is : ( 2 , 3 , 4 )
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a

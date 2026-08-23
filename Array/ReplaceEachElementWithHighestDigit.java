<<<<<<< HEAD
/*
Array Case 26: Replace Each Element with Highest Digit
 WAP to replace highest digit from each elements
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
output:{3, 5, 7, 7, 6, 7, 8, 5, 6, 7, 6}
*/

// class Main {
//     public static void main(String[] args) {
//         int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};
//         for(int i=0;i<arr.length;i++){
//             int max=0;
//             while(arr[i]>0){
//                 int rem=arr[i]%10;
//                 if(max<rem){
//                     max=rem;
//                 }
//                 arr[i]=arr[i]/10;
//             }
//             arr[i]=max;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         System.out.println("Start small. Ship something.");
//     }
// }


import java.util.Scanner;
class ReplaceEachElementWithHighestDigit{

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


	public static void EachHighest(int arr[]){
		//======== Replace Each Element with Highest Digit =======
		for(int i = 0; i < arr.length; i++) {
 			int max=0;
            		while(arr[i]>0){
                		int rem=arr[i]%10;
                		if(max<rem){
					max=rem;
				}
                		arr[i]=arr[i]/10;
            		}
            		arr[i]=max;
         	} 
		
	}

	public static void PrintHighest(int arr[]){
		System.out.println("======== AFTER Replace Each Element with Highest Digit ========");
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
		EachHighest(arr);
		PrintHighest(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
963
Enter Index 1 Element :
9896
Enter Index 2 Element :
74123
Enter Index 3 Element :
8523
Enter Index 4 Element :
85
======== ARRAY ELEMENT ========
Index 0 Element is 963
Index 1 Element is 9896
Index 2 Element is 74123
Index 3 Element is 8523
Index 4 Element is 85
======== AFTER Replace Each Element with Highest Digit ========
9       9       7       8       8
*/
=======
/*
Array Case 26: Replace Each Element with Highest Digit
 WAP to replace highest digit from each elements
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
output:{3, 5, 7, 7, 6, 7, 8, 5, 6, 7, 6}
*/

// class Main {
//     public static void main(String[] args) {
//         int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};
//         for(int i=0;i<arr.length;i++){
//             int max=0;
//             while(arr[i]>0){
//                 int rem=arr[i]%10;
//                 if(max<rem){
//                     max=rem;
//                 }
//                 arr[i]=arr[i]/10;
//             }
//             arr[i]=max;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//         System.out.println("Start small. Ship something.");
//     }
// }


import java.util.Scanner;
class ReplaceEachElementWithHighestDigit{

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


	public static void EachHighest(int arr[]){
		//======== Replace Each Element with Highest Digit =======
		for(int i = 0; i < arr.length; i++) {
 			int max=0;
            		while(arr[i]>0){
                		int rem=arr[i]%10;
                		if(max<rem){
					max=rem;
				}
                		arr[i]=arr[i]/10;
            		}
            		arr[i]=max;
         	} 
		
	}

	public static void PrintHighest(int arr[]){
		System.out.println("======== AFTER Replace Each Element with Highest Digit ========");
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
		EachHighest(arr);
		PrintHighest(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
963
Enter Index 1 Element :
9896
Enter Index 2 Element :
74123
Enter Index 3 Element :
8523
Enter Index 4 Element :
85
======== ARRAY ELEMENT ========
Index 0 Element is 963
Index 1 Element is 9896
Index 2 Element is 74123
Index 3 Element is 8523
Index 4 Element is 85
======== AFTER Replace Each Element with Highest Digit ========
9       9       7       8       8
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a

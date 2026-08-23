/*
Array Case 24: Replace Each Element with Average of Digits
 WAP to replace each elements with their avg of digit
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output: {2, 3, 5, 4, 5, 4, 6, 4, 5, 4, 5}
*/

// class ReplaceEachElementWithAverageOfDigits {
//     public static void main(String[] args) {
//         int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};
//         for(int i=0;i<arr.length;i++){
//             int cnt=0;
//             int sum=0;
//             while(arr[i]>0){
//                 cnt++;
//                 int rem=arr[i]%10;
//                 sum=sum+rem;
//                 arr[i]=arr[i]/10;
//             }
//             arr[i]=sum/cnt;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+"\t");
//         }
//     }
// }


import java.util.Scanner;
class ReplaceEachElementWithAverageOfDigits{

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


	public static void Average(int arr[]){
		//======== Replace Each Element with Sum of Digits=======
		for(int i = 0; i < arr.length; i++) {
 			int cnt=0;
            		int sum=0;
            		while(arr[i]>0){
                		cnt++;
                		int rem=arr[i]%10;
                		sum=sum+rem;
                		arr[i]=arr[i]/10;
            		}
            		arr[i]=sum/cnt;
         	} 
		
	}

	public static void PrintAverage(int arr[]){
		System.out.println("======== AFTER Replace Each Element with Average of Digits ========");
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
		Average(arr);
		PrintAverage(arr);

	}    
}

/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
123
Enter Index 1 Element :
963
Enter Index 2 Element :
45
Enter Index 3 Element :
963
Enter Index 4 Element :
23
======== ARRAY ELEMENT ========
Index 0 Element is 123
Index 1 Element is 963
Index 2 Element is 45
Index 3 Element is 963
Index 4 Element is 23
======== AFTER Replace Each Element with Average of Digits ========
2       6       4       6       2
*/
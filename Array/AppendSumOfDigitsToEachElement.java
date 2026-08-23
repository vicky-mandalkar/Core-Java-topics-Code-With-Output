/*
Array Case 27: Append Sum of Digits to Each Element 
WAP to add sum of digit of each elements at last of elements

Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56};
Output:{1236,23510,675422,325717,6410,236718,28818,358,64515,37411,5611};

*/


// class Main {
//     public static void main(String[] args) {
//         int arr[]={123,235,6754,3257,64,2367,288,35,645,374,56};
//         for(int i = 0; i < arr.length; i++) {
//             int sum = 0;
//             int temp = arr[i];
//             while(temp > 0){
//                 int rem = temp % 10;
//                 sum += rem;
//                 temp /= 10;
//             }
//             int pow = 1;
//             temp = sum;
//             while(temp > 0){
//                 pow *= 10;
//                 temp /= 10;
//             }
//             arr[i] = arr[i] * pow + sum;
//             System.out.print(arr[i]+"\t");
//         }     
//     }
// }


import java.util.Scanner;
class AppendSumOfDigitsToEachElement{

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


	public static void Append(int arr[]){
		//======== Append Sum of Digits to Each Element =======
		for(int i = 0; i < arr.length; i++) {

            		int sum = 0;
            		int temp = arr[i];

            		while(temp > 0){
                		int rem = temp % 10;
                		sum += rem;
                		temp /= 10;
            		}
           		int pow = 1;
            		temp = sum;

            		while(temp > 0){
                		pow *= 10;
                		temp /= 10;
            		}
        
            		arr[i] = arr[i] * pow + sum;
         	}
		
	}

	public static void PrintAppend(int arr[]){
		System.out.println("======== AFTER Append Sum of Digits to Each Element ========");
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
		Append(arr);
		PrintAppend(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
12
Enter Index 1 Element :
122
Enter Index 2 Element :
123
Enter Index 3 Element :
142
Enter Index 4 Element :
231
======== ARRAY ELEMENT ========
Index 0 Element is 12
Index 1 Element is 122
Index 2 Element is 123
Index 3 Element is 142
Index 4 Element is 231
======== AFTER Append Sum of Digits to Each Element ========
123     1225    1236    1427    2316
*/
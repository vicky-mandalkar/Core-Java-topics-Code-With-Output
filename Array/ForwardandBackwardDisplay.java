<<<<<<< HEAD
import java.util.Scanner;
class ForwardandBackwardDisplay{

//enter  input element in array 
	 
	static void inputArray(int arr[],Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+ i +" Array Element  : ");
			arr[i]=sc.nextInt();
		}
	} 


//array element are showing in Forward
	
	static void Forward(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index  "+ i +" Element is : "+ arr[i]);
		}
	}

//array element are showing in Backward
	
	static void Backward(int arr[]){
		for(int i=arr.length-1;i>=0;i--){
			System.out.println("Index  "+ i +" Element is : "+ arr[i]);
		}

	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("===========INPUT ELEMENT =================");
		inputArray(arr,sc);
		System.out.println("============= Forward Element ===============");
		Forward(arr);
		System.out.println("============= Backward Element ===============");
		Backward(arr);

			
	}
}
/*
Enter Array Size :
5
===========INPUT ELEMENT =================
Enter 0 Array Element  :
10
Enter 1 Array Element  :
20
Enter 2 Array Element  :
30
Enter 3 Array Element  :
40
Enter 4 Array Element  :
50
============= Forward Element ===============
Index  0 Element is : 10
Index  1 Element is : 20
Index  2 Element is : 30
Index  3 Element is : 40
Index  4 Element is : 50
============= Backward Element ===============
Index  4 Element is : 50
Index  3 Element is : 40
Index  2 Element is : 30
Index  1 Element is : 20
Index  0 Element is : 10
*/
=======
/*
Array Case 1: Forward and Backward Display
 Create an array of integers, store elements in it, and display the elements:
- In forward order (from first to last)
- In backward order (from last to first)
 Example Input:
Array = [10, 20, 30, 40, 50]
 Expected Output:
Forward: 10 20 30 40 50
Backward: 50 40 30 20 10
*/
import java.util.Scanner;
class ForwardandBackwardDisplay{

//enter  input element in array 
	 
	static void inputArray(int arr[],Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter "+ i +" Array Element  : ");
			arr[i]=sc.nextInt();
		}
	} 


//array element are showing in Forward
	
	static void Forward(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index  "+ i +" Element is : "+ arr[i]);
		}
	}

//array element are showing in Backward
	
	static void Backward(int arr[]){
		for(int i=arr.length-1;i>=0;i--){
			System.out.println("Index  "+ i +" Element is : "+ arr[i]);
		}

	}

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("===========INPUT ELEMENT =================");
		inputArray(arr,sc);
		System.out.println("============= Forward Element ===============");
		Forward(arr);
		System.out.println("============= Backward Element ===============");
		Backward(arr);

			
	}
}
/*
Enter Array Size :
5
===========INPUT ELEMENT =================
Enter 0 Array Element  :
10
Enter 1 Array Element  :
20
Enter 2 Array Element  :
30
Enter 3 Array Element  :
40
Enter 4 Array Element  :
50
============= Forward Element ===============
Index  0 Element is : 10
Index  1 Element is : 20
Index  2 Element is : 30
Index  3 Element is : 40
Index  4 Element is : 50
============= Backward Element ===============
Index  4 Element is : 50
Index  3 Element is : 40
Index  2 Element is : 30
Index  1 Element is : 20
Index  0 Element is : 10
*/
>>>>>>> 209d7a204d30a9b82fd17bcc52287fc7f1b2cf9a

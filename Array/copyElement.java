//Write a Java program to copy all elements from one array to another array.
import java.util.Scanner;
class copyElement{

	public static void InputArr(int arr[],Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.println("Index : "+i+" Enter Element :");
			arr[i]=sc.nextInt();
		}
	}

	public static void PrintArr(int arr[]){
		System.out.println("printing Array");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
			
		}
	}

	public static void CopyArr(int arr[],int []arr1){
			for(int i=0;i<arr.length;i++){
			arr1[i]=arr[i];
		}
	}

	public static void PrintCopy(int arr1[]){
		System.out.println("\n printing Copy");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+"\t");
			
		}
	}

	public static void  main(String ar[]){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter array Size : ");
		int size=sc.nextInt();
		int arr[] =new int[size];
		int arr1[] =new int[size];
		InputArr(arr,sc);
		PrintArr(arr);
		CopyArr(arr,arr1);
		PrintCopy(arr1);
	}
}

/*
Enter array Size :
5
Index : 0 Enter Element :
10
Index : 1 Enter Element :
20
Index : 2 Enter Element :
30
Index : 3 Enter Element :
40
Index : 4 Enter Element :
50
printing Array
10      20      30      40      50
 printing Copy
10      20      30      40      50
*/
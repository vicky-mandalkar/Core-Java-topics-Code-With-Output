import java.util.Scanner;
class SortAsendingOrder{

	public static void Input(int arr[],Scanner sc){
		System.out.println("======== Enter array Element ========");
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Index "+i+" Element : ");
			arr[i]=sc.nextInt();
		}
	}

	public static void sortingAsc(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j] ){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void SortAsc(int arr[]){
		System.out.println("======== AFTER SORTING ========");
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
		sortingAsc(arr);
		SortAsc(arr);

	}    
}
/*
Enter Array Size :
5
======== Enter array Element ========
Enter Index 0 Element :
12
Enter Index 1 Element :
5
Enter Index 2 Element :
946
Enter Index 3 Element :
2
Enter Index 4 Element :
12
======== AFTER SORTING ========
2       5       12      12      946
*/

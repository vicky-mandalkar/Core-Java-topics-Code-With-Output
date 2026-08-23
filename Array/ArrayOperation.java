import java.util.*;
class ArrayOperation{

	static void InputArray(int arr[],Scanner sc){
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter your "+i+" Element : \n");
			arr[i]=sc.nextInt();
	
		}
	}

	static void PrintArray(int arr[]){ //Print
		System.out.print("Your Array is :  ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	static void replaceElement(int arr[], Scanner sc){ //replace
		System.out.println("\nWhich Element you enter : ");
		int InsEle=sc.nextInt();

		System.out.println("\nEnter index where where want to add : ");
		int idx=sc.nextInt();

		for(int i=0;i<arr.length;i++){
			if(i==idx){		
				arr[i]=InsEle;	
			}
		}	
	}

	static void DeleteElement(int arr[],int del[],Scanner sc){ //Print
		int j=0;
		System.out.print("Which Element you want to delete : ");
		int di=sc.nextInt();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] != di){
				del[j++]=arr[i];	
			}			
		}

		//=============================
		for(int i=0;i<del.length;i++){
			System.out.print(del[i]+"\t");			
		}
	} 

	static void InsertElement(int arr[],int ist[], Scanner sc){ //Insert
		int j=0;
		System.out.println("\ninsert your value  : ");
		int ele=sc.nextInt();

		System.out.println("\nEnter index where where want to add : ");
		int idx=sc.nextInt();
		
 		for(int i=0;i<idx;i++){
			ist[j++]=arr[i];			
		}
		for(int i=idx;i<arr.length;i++){
			if(i==idx){
				ist[j++]=ele;
			}	
			ist[j++]=arr[i];	
		}

		for(int i=0;i<ist.length;i++){
			System.out.print(ist[i]+"\t");		
		}
	
	}



	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your size of an Array : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int del[]=new int[size-1];
		int ist[]=new int[size+1];		

		InputArray(arr,sc);	
		PrintArray(arr);

		System.out.println();	
		replaceElement(arr,sc);

		System.out.println();	
		PrintArray(arr);

		System.out.println();	
		DeleteElement(arr,del,sc);

		System.out.println();
		InsertElement(arr,ist,sc);	
	}


}
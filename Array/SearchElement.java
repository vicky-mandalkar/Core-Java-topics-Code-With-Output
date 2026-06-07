import java.util.Scanner;
class SearchElement{
		
	public static void search(int a[], Scanner sc) {
		System.out.println("Enter element you want to find :");
		int num = sc.nextInt();
		int index=0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]  == num) {
				index=i;
				System.out.println("Element is Fount at index is  : "+index);
				System.exit(0);			
			}		
		}
		System.out.println("Element is not found ...! ");
		
	}

	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter  Size of an Array : ");
		size=sc.nextInt();
		
		//Validation Chaeck
		if(size <=0){
			System.out.println("Always enter Positive ");
			System.exit(-1);
		}

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element : ");
			arr[i]=sc.nextInt();
		}
		
		//Printing Array element
		
		for(int i=0;i<arr.length;i++){
			
			System.out.println(i+" : "+arr[i]);

		}

		System.out.println("=================================");		

		search(arr,sc);

	}	
	
}
/*
Enter  Size of an Array :
6
Enter Element :
12
Enter Element :
13
Enter Element :
11
Enter Element :
22
Enter Element :
33
Enter Element :
44
0 : 12
1 : 13
2 : 11
3 : 22
4 : 33
5 : 44
=================================
Enter element you want to find :
33
Element is Fount at index is  : 4
*/
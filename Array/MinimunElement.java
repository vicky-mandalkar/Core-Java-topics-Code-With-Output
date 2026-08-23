import java.util.Scanner;
class MinimunElement{
		
	public static void min(int a[]) {
		int min = a[0];
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				index = i;
			}
		}
		System.out.println("Manimum Element is : " + min + "\nAnd index is : " + index);
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

		min(arr);

	}	
	
}
/*
Enter  Size of an Array :
5
Enter Element :
12
Enter Element :
4
Enter Element :
35
Enter Element :
2
Enter Element :
8
0 : 12
1 : 4
2 : 35
3 : 2
4 : 8
=================================
Manimum Element is : 2
And index is : 3
*/
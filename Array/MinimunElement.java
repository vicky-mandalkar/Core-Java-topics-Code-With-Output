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
10
Enter Element :
20
Enter Element :
8
Enter Element :
45
Enter Element :
21
0 : 10
1 : 20
2 : 8
3 : 45
4 : 21
=================================
Maximum Element is : 45
And index is : 3
*/
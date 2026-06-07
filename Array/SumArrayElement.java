import java.util.Scanner;
class SumArrayElement{
	
	static int sum=0;	
	public static void sum(int a[]){
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			System.out.print(a[i]+" ");
			
		}
		System.out.println();

		System.out.printf("Sum : "+sum);

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

		sum(arr);

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
30
Enter Element :
40
Enter Element :
50
0 : 10
1 : 20
2 : 30
3 : 40
4 : 50
=================================
10 20 30 40 50
Sum : 150
*/
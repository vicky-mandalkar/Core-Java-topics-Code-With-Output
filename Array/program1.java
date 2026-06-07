import java.util.Scanner;
class program1{
	
	public static void display(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.printf("i : %d A[%d] = %d\n",i,i,a[i]);
		}
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

		display(arr);

		

		
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
i : 0 A[0] = 10
i : 1 A[1] = 20
i : 2 A[2] = 30
i : 3 A[3] = 40
i : 4 A[4] = 50
=================================
0 : 10
1 : 20
2 : 30
3 : 40
4 : 50
*/
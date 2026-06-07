import java.util.Scanner;
class EvenAndOddCount{
		
	public static void count(int a[]) {
		int cnt1=0;
		int cnt2=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] %2 == 0) {
				//System.out.print(a[i]+"  ");	
				cnt1++;			
			}else{
				//System.out.print(a[i]+" ");
				cnt2++;	
			}
		}
		System.out.println("\nEven Element is : "+cnt1);
		System.out.print("Odd Element is  : "+cnt2);
		
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

		count(arr);

	}	
	
}
/*
Enter  Size of an Array :
6
Enter Element :
1
Enter Element :
2
Enter Element :
3
Enter Element :
4
Enter Element :
5
Enter Element :
6

0 : 1
1 : 2
2 : 3
3 : 4
4 : 5
5 : 6
=================================
Even Element is : 3
Odd Element is  : 3
*/
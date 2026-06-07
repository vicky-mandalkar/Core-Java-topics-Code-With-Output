import java.util.Scanner;
class printElement{
	static int  sum=0;
	public static void sum(int a[]){

	for(int i=0;i<a.length;i++){
		sum=sum+a[i];
	}
	System.out.println("Sum : "+sum);

	}
	System.out.println(sum);
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element : ");
			arr[i]=sc.nextInt();
		}
		System.out.println("===============================");
		for(int i=0;i<arr.length;i++){
			System.out.println(i);
			
		}
		System.out.println("================================");
		sum(arr);
	}
}
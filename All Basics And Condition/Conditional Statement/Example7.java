import java.util.Scanner;
class Example7{
	public static void main(String arg[]){

		

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter base number :");
		int b=sc.nextInt();
		System.out.print("Enter power number :");
		int p=sc.nextInt();
		int power=1;
		for(int  i=1;i<=p;i++){

						
			power=power*b;
		}System.out.println("power is : "+power);


		
	}

}
/*
Enter base number :5
Enter power number :3
power is : 125

*/
import java.util.Scanner;
class Example9{
	public static void main(String arg[]){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to find factorial :");
		int n=sc.nextInt();
		
		double  fact=1;


		for(int i=1;i<=n;i++){
			fact=fact*i;			
		}
		System.out.print("Factorial is "+n+" is :" +fact);
		
	}

}
/*
Enter Number to find factorial :5
Factorial is 5 is :120.0
*/
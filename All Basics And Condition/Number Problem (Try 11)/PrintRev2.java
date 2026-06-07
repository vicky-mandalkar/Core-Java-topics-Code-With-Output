
/*
Write a Java program to print all natural numbers in reverse (from n to 1). - using while loop
*/


import java.util.Scanner;
class PrintRev2{
	public static void  main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		
		for(int i=n;i>=1;i--){
			System.out.print(i+" ");

	
		}
	}
}
/*
Enter N:12
12 11 10 9 8 7 6 5 4 3 2 1
*/
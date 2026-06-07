/*
    Write a Java program to print all even numbers between 1 to 100. - using while loop

*/

import java.util.Scanner;
class EvenNum4{
	public static void  main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			if(i%2==0){
				System.out.print(i+" ");

			}
			
	
		}
	}

}
/*
Enter N:20
2 4 6 8 10 12 14 16 18 20
*/
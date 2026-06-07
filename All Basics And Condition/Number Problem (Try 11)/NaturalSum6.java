/*
   
       Write a Java program to find the sum of all natural numbers between 1 to n.

*/

import java.util.Scanner;
class NaturalSum6{
	public static void  main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;			
		}
		System.out.print("Sum of all 1 To "+n+" Natural Number :" +sum );
	}

}
/*
Enter N:10
Sum of all 1 To 10 Natural Number : 55
*/




/*
      Write a Java program to find the sum of all even numbers between 1 to n.
*/

import java.util.Scanner;
class EvenSum7{
	public static void  main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum=sum+i;
			}	
		
					
		}
		System.out.print("Sum of all 1 To "+n+" Even Number :" +sum );
	}

}
/*
Enter N:20
Sum of all 1 To 20 Even Number :110
*/


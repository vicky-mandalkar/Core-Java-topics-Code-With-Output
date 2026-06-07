/*
     Write a Java program to find the sum of all odd numbers between 1 to n.
*/


import java.util.Scanner;
class OddSum8{
	public static void  main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				sum=sum+i;
			}
			
		
					
		}
		System.out.print("Sum of all 1 To "+n+" Odd Number :" +sum );
	}

}
/*
Enter N:10
Sum of all 1 To 10 Odd Number :25
*/


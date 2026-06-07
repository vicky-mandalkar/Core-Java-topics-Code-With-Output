/*
   
    Write a Java program to print all even numbers between 1 to 100. - using while loop

*/

import java.util.Scanner;
class OddNum5{
	public static void  main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				System.out.print(i+" ");

			}
			
	
		}
	}

}
/*
Enter N:50
1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49
*/




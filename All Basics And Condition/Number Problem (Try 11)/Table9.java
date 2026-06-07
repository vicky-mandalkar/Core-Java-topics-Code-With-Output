/*
       Write a Java program to print a multiplication table of any number.
*/


import java.util.Scanner;
class Table9{
	public static void  main(String arg[]){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=10;i++){
			System.out.println( n +" * "+ i +" = " + n*i);
					
		}
		
	}

}
/*
Enter N:23
23 * 1 = 23
23 * 2 = 46
23 * 3 = 69
23 * 4 = 92
23 * 5 = 115
23 * 6 = 138
23 * 7 = 161
23 * 8 = 184
23 * 9 = 207
23 * 10 = 230

*/


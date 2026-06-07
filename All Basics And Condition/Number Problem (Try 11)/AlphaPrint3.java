/*
 Write a Java program to print all alphabets from a to z. - using while loop
*/

import java.util.Scanner;
class AlphaPrint3{
	public static void main(String arg[]){

		char s;
		char e;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Start Charzacter :");
		s=sc.next().charAt(0);
		System.out.print("Enter End Charzacter :");
		e=sc.next().charAt(0);
		/*
		while(s<=e){
			System.out.println(s+" ");
			s++;
		
		}
		*/


		for(char i=s;i<=e;i++){
			System.out.print(i+" ");

		}
	}
}
/*
Enter Start Charzacter :A
Enter End Charzacter :E
A B C D E
*/
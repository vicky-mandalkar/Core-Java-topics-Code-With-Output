import java.util.Scanner;

class Condition6{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		char ch=sc.next().charAt(0);

		
		if(ch=='A' || ch =='E' || ch=='I' || ch=='O' || ch=='U' ){
			System.out.println(ch+" vowel ");
		}
		
		else{
			System.out.println(ch+" Consonant ");
		}
		


	}

}
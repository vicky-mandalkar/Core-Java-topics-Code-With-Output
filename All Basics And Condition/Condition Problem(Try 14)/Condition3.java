import java.util.Scanner;

class Condition3{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		int n1=sc.nextInt();

		
		if(n1>0){
			System.out.println(" number is positive");
		}
		else if(n1<0){
			System.out.println(" number is negative");
		}
		else{
			System.out.println("number is zero");
		}
		


	}

}
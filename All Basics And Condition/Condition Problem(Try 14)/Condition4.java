import java.util.Scanner;

class Condition4{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		int n1=sc.nextInt();

		
		if(n1%5==0){
			System.out.println("number divisible by 5");
		}
		else if(n1%11==0){
			System.out.println(" number is divisible by 11");
		}
		else{
			System.out.println(" number is not divisible");
		}
		


	}

}
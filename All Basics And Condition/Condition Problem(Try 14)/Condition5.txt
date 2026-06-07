import java.util.Scanner;

class Condition5{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		int n1=sc.nextInt();

		
		if(n1%2==0){
			System.out.println(n1+" Number is Even ");
		}
		
		else{
			System.out.println(n1+" Number is Odd ");
		}
		


	}

}
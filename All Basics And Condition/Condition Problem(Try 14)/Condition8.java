import java.util.Scanner;

class Condition8{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		int n1=sc.nextInt();

		
		if(n1>=1 && n1<=100){
			System.out.println(n1+" is between 1 to 100");
		}
		
		else{
			System.out.println(n1+" is Not  between 1 to 100");
		}
		


	}

}
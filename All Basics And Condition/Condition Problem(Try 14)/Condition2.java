import java.util.Scanner;

class Condition2{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		int n1=sc.nextInt();

		System.out.print("Enter 2nd number  :");
		int n2=sc.nextInt();

		System.out.print("Enter 3rd number  :");
		int n3=sc.nextInt();

		if(n1>n2 && n1>n3){
			System.out.println("Grater Number is : "+n1);
		}
		else if( n2>n1 && n2>n3 ){
			System.out.println("Grater Number is : "+n2);
		}
		else{
			System.out.println("Grater Number is : "+n3);
		}
		


	}

}
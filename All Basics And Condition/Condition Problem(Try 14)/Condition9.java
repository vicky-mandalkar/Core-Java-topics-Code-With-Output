import java.util.Scanner;

class Condition9{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		int n1=sc.nextInt();

		
		if(n1>99 && n1<1000){
			System.out.println(n1+" is 3 digit");
		}
		
		else{
			System.out.println(n1+" is Not 3 digit");
		}
		


	}

}
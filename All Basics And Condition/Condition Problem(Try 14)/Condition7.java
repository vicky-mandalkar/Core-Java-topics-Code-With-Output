import java.util.Scanner;

class Condition7{
	public static void main(String ar[]){
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter 1st number  :");
		int year=sc.nextInt();

		
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
			System.out.println(year +" is leap year ");
		}
		
		else{
			System.out.println(year+" not the leap year ");
		}
		


	}

}
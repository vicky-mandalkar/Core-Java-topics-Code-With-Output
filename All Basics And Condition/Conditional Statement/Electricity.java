import java.util.Scanner;
class Electricity{
	public static void main(String ar[]){
		double Units;

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Units : ");
		
		Units=sc.nextDouble();

		if(Units <= 50){
			double bill=(0.50 * Units );
			double total=(bill*0.2)+bill;
			System.out.print("Total Bill is : "+total);
		}
		else if( Units <=150 ){
			double bill=(0.75 * Units );
			double total=(bill*0.2)+bill;
			System.out.print("Total Bill is : "+total);

		}
		else if( Units <=250 ){
			double bill=(1.20 * Units );
			double total=(bill*0.2)+bill;
			System.out.print("Total Bill is : "+total);

		}
		else{
			double bill=(1.50 * Units );
			double total=(bill*0.2)+bill;
			System.out.print("Total Bill is : "+total);
		}			
	}
}

/*
Enter your Units : 25
Total Bill is : 15.0
*/
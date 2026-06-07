import java.util.Scanner;
class GrossSalary{
	public static void main(String ar[]){
		double BasSal;

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Basic Sallary : ");
		
		BasSal=sc.nextDouble();

		if(BasSal <= 10000){
			double GrossSal=((0.2*BasSal)+(0.8* BasSal)+BasSal);
			System.out.print("GrossSallary is : "+ GrossSal);
		}
		else if( BasSal <= 20000){
			double GrossSal=((0.25*BasSal) + (0.9*BasSal)+ BasSal);
			System.out.print("GrossSallary is : "+ GrossSal);

		}
		else{
			double GrossSal=((0.3*BasSal) + (0.95*BasSal)+ BasSal);
			System.out.print("GrossSallary is : "+ GrossSal);
		}
			
	}

}
/*
Enter your Basic Sallary : 5000
GrossSallary is : 10000.0
*/
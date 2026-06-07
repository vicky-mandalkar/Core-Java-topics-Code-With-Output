import java.util.Scanner;
class CarInfo{
	String Brand;
	double Price;
	String colour;
	float Weight;
	int Speed;
	int Wheel; 
	
	 void getCarDetails(){
	    System.out.println("Brand  	: "+Brand);
	    System.out.println("Price  	: "+Price+ "cr");
	    System.out.println("colour  : "+colour);
	    System.out.println("Weight  : "+Weight+ "Kg");
	    System.out.println("Speed 	: "+Speed+ "Km/hr");
	    System.out.println("Wheel   : "+Wheel);
	    
		
	}

}

class Car{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		CarInfo CI=new CarInfo();
		
		System.out.println("Enter Car Brand : :");
		CI.Brand=sc.nextLine();

		System.out.println("Enter Car Prise : :");
		CI.Price=sc.nextDouble();

		System.out.println("Enter car Colour : :");
		CI.colour=sc.next();
		
		System.out.println("Enter Car Weight : :");
		CI.Weight=sc.nextFloat();

		System.out.println("Enter Car Speed: :");
		CI.Speed=sc.nextInt();

		System.out.println("enter how many Wheels : :");
		CI.Wheel=sc.nextInt();
		
		System.out.println(" ************* Car Details ************* ");
		CI.getCarDetails();
			
	}
}
/*
Enter Car Brand : :
BMW
Enter Car Prise : :
1200000
Enter car Colour : :
White
Enter Car Weight : :
500
Enter Car Speed: :
400
enter how many Wheels : :
4
 ************* Car Details *************
Brand   : BMW
Price   : 1200000.0cr
colour  : White
Weight  : 500.0Kg
Speed   : 400Km/hr
Wheel   : 4
*/
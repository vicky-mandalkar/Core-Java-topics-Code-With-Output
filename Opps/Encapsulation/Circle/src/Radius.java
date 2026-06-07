public class Radius{
	public static void main(String ar[]){
		
		// Object c1
        	Circle c1 = new Circle(2.0, "blue");

        	// Object c2
        	Circle c2 = new Circle(2.0);

        	// Object c3
        	Circle c3 = new Circle();

        	// Display c1 details
        	System.out.println("C1 Details");
        	System.out.println("Radius: " + c1.getRadius());
        	System.out.println("Color: " + c1.getColor());
        	System.out.println("Area: " + c1.getArea());

        	System.out.println();

        	// Display c2 details
        	System.out.println("C2 Details");
        	System.out.println("Radius: " + c2.getRadius());
        	System.out.println("Color: " + c2.getColor());
        	System.out.println("Area: " + c2.getArea());

        	System.out.println();

        	// Display c3 details
        	System.out.println("C3 Details");
        	System.out.println("Radius: " + c3.getRadius());
        	System.out.println("Color: " + c3.getColor());
        	System.out.println("Area: " + c3.getArea());
	}
}
/*
C1 Details
Radius: 2.0
Color: blue
Area: 12.56

C2 Details
Radius: 2.0
Color: red
Area: 12.56

C3 Details
Radius: 2.0
Color: red
Area: 12.56
*/
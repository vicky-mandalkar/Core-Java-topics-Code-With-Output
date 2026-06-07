class Radius{
	public static void main(String args[]){
		Circle c1 = new Circle();
        	c1.getRadius();
        	c1.getColor();
        	c1.geArea();

		System.out.println("-------------------------------------------");

		Circle c2 = new Circle(2.0);
        	c2.getRadius();
        	c2.getColor();
        	c2.geArea();

		System.out.println("-------------------------------------------");

		Circle c3 = new Circle(3.0,"Blue");
        	c3.getRadius();
        	c3.getColor();
        	c3.geArea();

	}
}
/*
Radius : 1.0
Colour : red
Area : 3.14
-------------------------------------------
Radius : 2.0
Colour : red
Area : 12.56
-------------------------------------------
Radius : 3.0
Colour : Blue
Area : 28.259999999999998
*/
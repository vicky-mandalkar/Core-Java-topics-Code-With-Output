
class Circle{
	double radius=1.0;
	String color = "red";

	Circle(){

	}

	Circle(double r){
		radius=r;
	}

	Circle(double r, String c){
		radius=r;
		color=c;
	}

	void getRadius(){
		System.out.println("Radius : "+radius);
	}
	void getColor(){
		System.out.println("Colour : "+color);
	}
	void geArea(){
		double Area=3.14*radius*radius;
		System.out.println("Area : "+Area);
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
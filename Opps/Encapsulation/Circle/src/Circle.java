public class Circle{
	private double radius;
	private String color;

	//Constructor
	Circle(){
		radius=2.0;
		color="red";
	}
	Circle(double radius){
		this.radius=radius;
		color="red";
	}
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	

	//Getter method
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	public double getArea(){
		return 3.14 * radius * radius;
	}

		
}
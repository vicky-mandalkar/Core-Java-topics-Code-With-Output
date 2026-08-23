class Circle{
	private  double radius;
	private String color;

	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}

	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
	public double getArea(){
		return Math.PI*radius*radius;
	}

	public  String toString(){
		return "[ Radius = "+radius+", Color = "+color+"]";
	}
	
}
class Cylinder extends Circle{
	private double height;
	
	Cylinder(double radius){
		super(radius);
	}
	Cylinder(double height,double radius,String color){
		super(radius,color);
		this.height=height;
	}
	
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	
	public double getVolume(){
		return getArea()*height;
	}
}

class InheriAss{
	public static void main(String ar[]){
	Circle ci=new Circle(2,"red");
	System.out.println("Area : "+ci.getArea());

	Cylinder cy=new Cylinder(5,2,"black");
	System.out.println("Volume : "+cy.getVolume());
	}
}

/*
Area : 12.566370614359172
Volume : 62.83185307179586
*/
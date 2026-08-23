// Abstract Parent Class
abstract class Shape {

    // Protected Data Members
    protected String color = "red";
    protected boolean filled = true;

    // Constructors
    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Abstract Methods
    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

class Circle extends Shape {

    protected double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}

class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length,
                     String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[" + super.toString()
                + ", width=" + width
                + ", length=" + length + "]";
    }
}
class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

class Main {

    public static void main(String[] args) {

        Shape s1 = new Circle(5, "Blue", true);

        System.out.println(s1);
        System.out.println("Area = " + s1.getArea());
        System.out.println("Perimeter = " + s1.getPerimeter());

        System.out.println();

        Shape s2 = new Rectangle(4, 6, "Green", false);

        System.out.println(s2);
        System.out.println("Area = " + s2.getArea());
        System.out.println("Perimeter = " + s2.getPerimeter());

        System.out.println();

        Shape s3 = new Square(5, "Red", true);

        System.out.println(s3);
        System.out.println("Area = " + s3.getArea());
        System.out.println("Perimeter = " + s3.getPerimeter());
    }
}

/*
Circle[Shape[color=Blue, filled=true], radius=5.0]
Area = 78.53981633974483
Perimeter = 31.41592653589793

Rectangle[Shape[color=Green, filled=false], width=4.0, length=6.0]
Area = 24.0
Perimeter = 20.0

Square[Rectangle[Shape[color=Red, filled=true], width=5.0, length=5.0]]
Area = 25.0
Perimeter = 20.0
*/
class Shape {
    private String color;
    private boolean filled;

    Shape() {
        color = "Black";
        filled = false;
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Color = " + color + ", Filled = " + filled;
    }
}

// ---------------- Circle ----------------

class Circle extends Shape {
    private double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle ["
                + super.toString()
                + ", Radius = " + radius
                + "]";
    }
}

// ---------------- Rectangle ----------------

class Rectangle extends Shape {
    private double width;
    private double length;

    Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length,
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

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle ["
                + super.toString()
                + ", Width = " + width
                + ", Length = " + length
                + "]";
    }
}

// ---------------- Square ----------------

class Square extends Rectangle {

    Square() {
        super(1.0, 1.0);
    }

    Square(double side) {
        super(side, side);
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square ["
                + super.toString()
                + ", Side = " + getSide()
                + "]";
    }
}

// ---------------- Main ----------------

class Main {
    public static void main(String[] args) {

        Shape s = new Shape("Red", true);
        System.out.println(s);

        Circle c = new Circle(5, "Blue", true);
        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());

        Rectangle r = new Rectangle(4, 6, "Green", false);
        System.out.println(r);
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());

        Square sq = new Square(5, "Yellow", true);
        System.out.println(sq);
        System.out.println("Area = " + sq.getArea());
        System.out.println("Perimeter = " + sq.getPerimeter());
    }
}
public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        Rectangle r2 =new Rectangle(10.5f, 5.5f);

        System.out.println("Rectangle R1 : " + r1);

        System.out.println("Rectangle R2 : " + r2);
        System.out.println("Length : " + r2.getLength());

        System.out.println("Width : " + r2.getWidth());

        // Area
        System.out.println("Area : " + r2.getArea());

        System.out.println("Perimeter : " +r2.getPerimeter());

        r2.setLength(20.0f);

        r2.setWidth(8.0f);

        System.out.println("Updated Rectangle : " + r2);

        System.out.println("Updated Area : " +r2.getArea());

        System.out.println( "Updated Perimeter : " + r2.getPerimeter() );
    }
}
/*
Rectangle R1 : Rectangle[length=1.00, width=1.00]
Rectangle R2 : Rectangle[length=10.50, width=5.50]
Length : 10.5
Width : 5.5
Area : 57.75
Perimeter : 32.0
Updated Rectangle : Rectangle[length=20.00, width=8.00]
Updated Area : 160.0
Updated Perimeter : 56.0
*/
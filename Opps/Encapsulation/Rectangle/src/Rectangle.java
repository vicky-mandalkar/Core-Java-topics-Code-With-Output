public class Rectangle {

  
    private float length = 1.0f;
    private float width = 1.0f;

   
    Rectangle() {

        length = 1.0f;
        width = 1.0f;
    }

   
    Rectangle(float length, float width) {

        this.length = length;
        this.width = width;
    }

    // Getter methods

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    // Setter methods

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {

        return length * width;
    }


    public double getPerimeter() {

        return 2 * (length + width);
    }


    public String toString() {

        return String.format("Rectangle[length=%.2f, width=%.2f]",length, width );
    }
}
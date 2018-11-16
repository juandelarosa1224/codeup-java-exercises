package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    public Rectangle(double length, double width) {
        this.length = length ;
        this.width = width;
    }

// formula for perimeter = 2 x length + 2 x width
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }

    //   formula for area = length x width
    public double getArea(){
        return length * width;
    }
}

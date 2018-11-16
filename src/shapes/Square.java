package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }
    public double getPerimeter() {
        return length * length;
    }

    public double getArea() {
        return length * 4;
    }
}

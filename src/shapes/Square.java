package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }


    //    perimeter = 4 x side
    public double getPerimeter() {
        return 4 * length;
    }

//    area = side ^ 2
    public double getArea() {
        return Math.pow(this.length, 2);
    }
}

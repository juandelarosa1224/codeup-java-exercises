package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        create variable with new instance
        Measurable myShape;
        myShape= new Rectangle(4, 5);

//        verify methods=========================================================================
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = new Square(4);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
    }
}

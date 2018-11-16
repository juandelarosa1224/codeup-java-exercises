package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        create variable with new instance
        Rectangle box1 = new Rectangle (4, 5);
//        verify methods=========================================================================
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

//      create variable with new instance
        Rectangle box2 = new Square(5);
//        verify methods=========================================================================
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}

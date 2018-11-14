package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter the radius of a circle");
        Input in = new Input(new Scanner(System.in));
        Circle c = new Circle(in.getDouble());
        System.out.println("Area " + c.getArea());
        System.out.println("Circumference " + c.getCircumference());
    }
}

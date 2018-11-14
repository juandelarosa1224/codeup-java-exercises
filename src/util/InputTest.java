package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a string");
        Input input = new Input(sc);
        System.out.println(input.getString());
        System.out.println("please say yes or no");
        Input input1 = new Input(sc);
        System.out.println(input1.yesNo());
        System.out.println(input.getInt(1, 9));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(1, 9));
        System.out.println(input.getDouble());
    }
}

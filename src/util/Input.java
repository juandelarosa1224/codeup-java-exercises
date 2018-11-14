package util;

import java.util.Scanner;

public class Input {
    private Scanner sc;
    public Input(Scanner sc) {
        this.sc = sc;
    }

    public String getString(){
    return this.sc.nextLine();
}
    public Boolean yesNo(){
        String answer = sc.next();
        return (answer.equals("yes") || answer.equals("y"));
    }
    public int getInt(int min, int max){
        int input;
        do {
            System.out.println("enter an integer");
            input = sc.nextInt();
        } while (input >= min && input <= max);
        return input;
    }
    public int getInt(){
        return sc.nextInt();
    }
    public double getDouble(double min, double max) {
        double input;
        System.out.println("enter a decimal integer");
        input = sc.nextDouble();
        if (input >= min && input <= max){
            System.out.println("You are within range!");
        } else {
            return getDouble(min, max);
        }
        return input;
    }
    public double getDouble(){
        return sc.nextDouble();
    }
}


//      int getInt() {
//            if (!scanner.hasNextInt()) {
//                System.out.println("please enter a number between 1 and 3");
//                int userInt = input.getInt(1, 3);
//                System.out.pringln("enter an integer");
//                System.out.println("you chose " + input.getInt());
//                    }
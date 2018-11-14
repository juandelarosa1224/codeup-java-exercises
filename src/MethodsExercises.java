//import java.util.Scanner;
//public class MethodsExercises {
//    public static void main(String[] args) {
// === 1 ===Create four separate methods. Each will perform an arithmetic operation:
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//        System.out.println(add(1,3));
//        System.out.println(sub(8,4));
//        System.out.println(mult(2,2));
//        System.out.println(div(8,2));
//        System.out.println(mod(9,5));
//        System.out.println(factorial(9));
//        Scanner sc = new Scanner(System.in);
//        System.out.println(rollDiceGame(sc));
//        System.out.print(userInteractionFactorial(sc));
//    }
// ®       Addition
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//        Subtraction
//    public static int sub(int num1, int num2) {
//        return num1 - num2;
//    }
//        Multiplication
//    public static int mult(int num1, int num2) {
//        return num1 * num2;
//    }
//        Division
//    public static int div(int num1, int num2) {
//        return num1 / num2;
//    }
//        Add a modulus function that finds the modulus of two numbers.
//    public static int mod(int num1, int num2) {
//        return num1 % num2;
//    }

//        Food for thought: What happens if we try to divide by zero? What should happen?
//        ============ runtime error, unable to divide by 0===============
//
//         Create a method that validates that user input is in a certain range
//
//         Question 2
//
//    public static int getInteger(int min, int max) {
//        if (!sc.hasNextInt()) {
//            System.out.println("Not a number!");
//            return getInteger(min, max, sc);
//        }
//        int userInput = sc.nextInt();
//        if (userInput >= min && userInput <= max) {
//            return userInput;
//        } else {
//            System.out.println("Number not in range!");
//            return getInteger(min, max, sc);
//        }
//    }
//        If the input is invalid, prompt the user again.
//
//                Hint: recursion might be helpful here!
//
//                Calculate the factorial of a number.
//
//                Prompt the user to enter an integer from 1 to 10.


    // == 3 == the following solution provided by == https://introcs.cs.princeton.edu/java/23recursion/

//    public static long factorial(int n) {
//        if (n == 0) return 1;
//        return n * factorial(n - 1);
//    }

//    public static long calculateFactorial(int num) {
//        int output = 1;
////        set output to 1. it is not set to zero because any number multiplied by 0 = 0.
//        for (int i = 1; i <= num; i += 1) {
//            output *= i;
////            for loop gets factorial and multiplies i by i++ until i = or less than number the user inputs.
//        }
//        return output;
////        return input
//    }
////    the following gets the number for factorial from the user.
//    public static void userInteractionFactorial(Scanner sc) {
//        boolean willContinue;
////        boolean with a null value.
//        String userChoice;
////        set a userChoice empty variable.
//        do {
//            System.out.println("Please enter an integer from 1 to 12");
//            int userInt = getInteger(1, 12);
//            System.out.println(calculateFactorial(userInt));
//            do {
//                System.out.println("Do you wish to continue? [y/n]: ");
////                promts user whether or not to continue.
//                userChoice = sc.next().trim();
////                userChoice varaiable is prompting the user whether to continue or not.
////                using .trim to clear whitespace.
//            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//            willContinue = userChoice.equalsIgnoreCase("y");
////            the while loop is set to loop if the userChoice equals "y" and not equal to "n".
////            willContinue will be true only if the userChoice is "y".
//        } while (willContinue);
//        this will continue if the user wishes to continue.
//    }
//}


//}

//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//                Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//                Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24
//        Bonus
//
//        Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//        Use Recursion to implement the factorial.
//
//
// Create an application that simulates dice rolling.
        // Exercise 4
//        Scanner sc = new Scanner(System.in);
//    public static int randomWithRange(int min, int max)
//    {
//        int range = (max - min) + 1;
//        return (int)(Math.random() * range) + min;
//    }
//    public static void rollDiceGame(Scanner sc) {
//        String userChoice;
//        System.out.print("Please enter the number of sides for the dice: ");
//        int nSides = getInteger(1, 20);
//        do {
//            System.out.println("You have rolled a " + randomWithRange(1, nSides) + " and a " + randomWithRange(1, nSides));
//            do {
//                System.out.println("Would you like to roll again? [y/n]");
//                userChoice = sc.next().trim();
//            } while (!userChoice.equalsIgnoreCase("y") & !userChoice.equalsIgnoreCase("n"));
//        } while (!userChoice.equals("n"));
//    }
//}

//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.
//        Game Development 101


//        Welcome to the world of game development!
//
//                You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//        The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"
//        Hints

//
//        Use the random method of the java.lang.Math class to generate a random number.
//        Bonus
//
//        Keep track of how many guesses a user makes
//        Set an upper limit on the number of guesses

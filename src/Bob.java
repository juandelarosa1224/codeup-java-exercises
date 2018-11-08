import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String more;

        do {

            System.out.println("Ask Bob a question?");
            String userInput = sc.nextLine();
        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
            System.out.println("Ask more questions?");

        more = sc.nextLine();

        } while (more.equalsIgnoreCase("yes"));
        System.out.println("bye");
    }
}
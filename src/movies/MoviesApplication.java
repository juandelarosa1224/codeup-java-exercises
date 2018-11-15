package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);
        Movie[] movies = MoviesArray.findAll();
        int userInput;
        do {
            System.out.println("What would you like to do?\n" +
                    "0 -- exit\n" +
                    "1 -- view all movies\n" +
                    "2 -- view movies in animated category\n" +
                    "3 -- view movies in drama category\n" +
                    "4 -- view movies in horror category\n" +
                    "5 -- view movies in sci-fi category\n" +
                    "Enter your choice");
            userInput = input.getInt();
            showMovies(userInput, movies);

        } while (userInput != 0);
    }

        public static void showMovies(int categoryNumber, Movie[] movies) {
            System.out.println("\n");
            String category = "";
            switch (categoryNumber) {
                case 1:
                    System.out.println("display all movies");
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                case 2:
                    System.out.println("Here is the animated category");
                    category = "animated";
                    break;
                case 3:
                    System.out.println("Here is the drama category");
                    category = "drama";
                    break;
                case 4:
                    System.out.println("Here is the horror category");
                    category = "horror";
                    break;
                case 5:
                    System.out.println("Here is the sci-fi category");
                    category = "sci-fi";
                    break;
            }
            if (categoryNumber != 0) {
                System.out.println("display" + category + "movies");
                for (Movie movie : movies) {
                    if (movie.getCategory().equals(category)) {
                        System.out.println(movie.getName() + "--" + movie.getCategory());
                    }
                }
            }
        }
}



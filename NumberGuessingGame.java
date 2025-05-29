import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(100) + 1; // 1 to 100
        int attempts = 5;
        int guess = 0;

        System.out.println("====================================");
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        System.out.println("====================================");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + attempts + " tries.\n");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");

            try {
                guess = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer number.");
                sc.next(); // clear the invalid input
                continue;  // ask input again without reducing attempts
            }

            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;

            if (attempts > 0) {
                System.out.println("Tries left: " + attempts + "\n");
            } else {
                System.out.println("No tries left. The number was: " + numberToGuess);
            }
        }

        System.out.println("\nGame Over. Thanks for playing!");
        sc.close();
    }
}



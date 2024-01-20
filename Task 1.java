import java.util.Random;
import java.util.Scanner;

public class ChallengingNumberGame {

    public static void main(String[] args) {
        System.out.println("Welcome to the Challenging Number Game!");
        System.out.println("I've selected a random number between 1 and 100.");
        System.out.println("Your task is to guess the number with the fewest attempts.");

        int secretNumber = new Random().nextInt(100) + 1;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low. Try again.");
            } else {
                System.out.println("Too high. Try again.");
            }
        }

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1; // Random number 1-100
        int guess = 0;
        int attempts = 0;

        System.out.println("🎲 Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100...");

        // Keep guessing until correct
        while (guess != target) {
            System.out.print("Enter your guess: ");
            
            if (!scanner.hasNextInt()) {
                System.out.println("❌ Please enter a valid number!");
                scanner.next(); // Clear invalid input
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("⬆️ Too low, try again!");
            } else if (guess > target) {
                System.out.println("⬇️ Too high, try again!");
            } else {
                System.out.println("✅ Correct! The number was " + target);
                System.out.println("You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}

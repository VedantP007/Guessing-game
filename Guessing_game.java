import java.util.Scanner;
import java.util.Random;

public class Guessing_game {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess the number between 1 and 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
        }

        sc.close();
    }
}

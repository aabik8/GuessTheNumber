import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            int numberToGuess = randomNumber.nextInt(100) + 1;
            int numberOfTries = 0;
            int guess;
            boolean win = false;


            while (!win) {
                System.out.println("Guess a number between 1 and 100.");
                guess = scanner.nextInt();
                numberOfTries++;

                if (guess == numberToGuess) {
                    System.out.println("You won!");
                    System.out.println("It took you " + numberOfTries + " of tries!");
                    win = true;
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                }
            }

            System.out.println("Would you like to play again?");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
    }
}

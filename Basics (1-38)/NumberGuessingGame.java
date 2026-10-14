import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    // Project 7 - Number Guessing Game
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean done = false;
        int guess = random.nextInt(1, 101);
        int attempts = 0;

        while (num >= 0 && num <=100 && done == false) {
            System.out.println("Enter a valid number between 1-100 and guess the random number");
            num = scanner.nextInt();

            if (num == guess) {
                System.out.println("You are correct!!");
                done = true;
            } else {
                attempts++;
                if (guess < num) {
                    System.out.println("Try again too high");
                } else if (guess > num) {
                    System.out.println("Try again too low");
                }
            }

        } // Can also use a do-while loop but I chose to do regular while loop just to test I knew it
        System.out.println("Attempts: " + attempts);



        scanner.close();


    }
    
}

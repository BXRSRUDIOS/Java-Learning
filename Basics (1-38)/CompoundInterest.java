import java.util.Scanner;

public class CompoundInterest {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Project 3 - Compound Interest Calculator

        double initial;
        double rate;
        int years;
        double amount;

        System.out.println("Enter initial amount");
        initial = scanner.nextDouble();

        System.out.println("Enter interest rate");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter number of years");
        years = scanner.nextInt();

        amount = initial * Math.pow((1+rate), years);
        System.out.println("New Amount: $" + amount);

        scanner.close();

    }

}

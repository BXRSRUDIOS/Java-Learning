import java.util.Scanner;

public class Calculator {
    // Project 6 - Simple Calculator Program

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.println("Enter Num 1");
        num1 = scanner.nextDouble();
        System.out.println("Enter Operator +, -, *, /, ^");
        operator = scanner.next().charAt(0);
        System.out.println("Enter Num 2");
        num2 = scanner.nextDouble();
        boolean validOperation = true;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2==0) {
                    System.out.println("Can't divide by 0");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> Math.pow(num1, num2);
            default -> {
                System.out.println("Not valid operator"); 
                validOperation = false;
            }
        }
        
        if (validOperation) {
            System.out.println(result);
        } else {
            System.out.println("Not Valid Calculation");
        }

        scanner.close();
    }

}

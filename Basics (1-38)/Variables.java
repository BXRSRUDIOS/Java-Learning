import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        // Integers - 4 Types: byte, short, int, long
        int age = 18;
        int year = 2085;
        byte smallNumber  = -124; // -128 to +127 - 1 byte storage
        short littleLargerNumber = -4390; // -32768 to +32767 - 2 bytes storage
        int regularNumber = 3590234; // -2^31 to +2^31 - 1 - 4 bytes storage
        long largeNumber = 373597082; // -2^63 to +2^63 - 1 - 8 bytes storage


        System.out.println(age);
        System.out.println("The year is " + year + " and we are very old");
        
        // Doubles & Floats
        double price = 23.30;
        double gpa = 2.1;
        float temp = (float) 3.4;

        System.out.println("The cost of my shopping was $" + price);
        System.out.println("My GPA was really low, it was a " + gpa);
        System.out.println(temp);

        // Boolean

        boolean isOld = true;
        boolean isTall = false;
        
        System.out.println(isOld);
        System.out.println(isTall);

        // Strings & Chars

        String name1 = "Joey Chestnut";
        String name2 = "Bilal Raja";
        char letter = 'a';
        char symbol = '%';

        System.out.println("I (" + name2 + ") really like the famous guy called " + name1 + "!!");
        System.out.println(letter + " " + symbol);


        // Input
        /*
        nextLine() = string
        nextInt() = integer
        nextDouble() = double
        nextFloat() = float
        nextBoolean() = boolean

        or for simplicity sake:
        next[VariableTypeHere]()

        If there is an input buffer if entering a string after integer just do
        scannerName.nextLine()
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name);

        input.close();

    }    
}

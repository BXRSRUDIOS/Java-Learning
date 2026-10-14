import java.util.Scanner;

public class ShoppingCart {
    
    // Shopping Cart Program Project 2

    public static void main(String[] args) {
        // Variables declared to see what to buy, price & quantity
        String item;
        double price;
        int quantity;
        char currency = '£';
        double total;

        // Get input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you wanna buy? ");
        item = scanner.nextLine();

        System.out.println("How many of this item do you want? ");
        quantity = scanner.nextInt();

        System.out.println("What is the price of the item?");
        price = scanner.nextDouble();

        scanner.close();

        // Perform Calculations for Total Price
        total = price * quantity;

        // Output message
        System.out.println("Item : " + item + ". Quantity: " + quantity + ". Price: " + currency + price + ". Total Cost: " + currency + total + ".");

        
    
    }
    
}

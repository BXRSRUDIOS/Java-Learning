import java.util.Scanner;

public class WhileLoops {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.println("Enter name");
            name = scanner.nextLine();
        }

        System.out.println("Welcome " + name);

        scanner.close();

    }

}

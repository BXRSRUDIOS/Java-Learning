import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        String type;
        double temp;
        double newTemp;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert to C or F?");
        type = scanner.nextLine();
        System.out.println("Enter temperature");
        temp = scanner.nextDouble();

        newTemp = (type.equals("C")) ? (temp-32)*5/9 : (temp*5/9)+32;
        System.out.println(newTemp);

        scanner.close();

    }

}

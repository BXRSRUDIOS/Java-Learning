import java.util.Scanner;

public class WeightConversion {
    
    public static void main(String[] args) {
        
        // Project 4 - Weight Conversion

        // Declare Variables

        String type;
        double weight;
        double newWeight;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lbs to convert KG to LBS or kgs to convert LBS to KG");
        type = scanner.nextLine();

        System.out.println("Enter weight");
        weight = scanner.nextDouble();

        if (weight >= 0) {
            if (type.equals("lbs")) {
                newWeight = weight *  0.453592;
                System.out.println(newWeight);
            } else if (type.equals("kgs")) {
                newWeight = weight *  2.20462;
                System.out.println(newWeight);
            } else {
                System.out.println("Enter valid conversion type");
            }
        } else {
            System.out.println("Enter weight >= 0");
        }


        scanner.close();
    }

}

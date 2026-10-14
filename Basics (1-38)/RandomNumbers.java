import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        
        Random random = new Random();

        int number;

        number = random.nextInt(1, 7); // 1 included, 7 excluded (1-6) 

        System.out.println(number);

        double number2;

        number2 = random.nextDouble();

        System.out.println(number2);

        boolean checker = random.nextBoolean();

        if (checker) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
        

    }    
}

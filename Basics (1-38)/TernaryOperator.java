
public class TernaryOperator {
    
    public static void main(String[] args) {
        
        int score = 12;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";

        System.out.println(passOrFail);

        int number = 4;

        int evenOrOdd = (number % 2 == 0) ? 1 : 0;

        System.out.println(evenOrOdd);

    }
    
}

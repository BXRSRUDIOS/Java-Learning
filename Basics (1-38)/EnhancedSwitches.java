public class EnhancedSwitches {

    public static void main(String[] args) {
        
        String day = "Tuesday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday"); 
            case "Saturday", "Sunday" -> System.out.println("It is the weekend");
            default -> System.out.println("This is NOT a day");
        } 

    }
    
}

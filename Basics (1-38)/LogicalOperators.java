public class LogicalOperators {
    
    public static void main(String[] args) {
        
        double temp = 3333;

        if (temp >= 15 && temp <= 30) {
            System.out.println("I don't have anything to say about the weather");
        } else if ((temp > 30 && temp <= 60) || (temp >= 0 && temp < 15)) {
            System.out.println("Strange weather right?");
        } else {
            System.out.println("Don't even want to question what's possibly going on with your weather");
        }

    }
}

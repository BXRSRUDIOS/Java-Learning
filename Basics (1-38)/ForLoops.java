
public class ForLoops {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 15 ; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // break vs continue test
            }
            System.out.print(i+ " ");
        } 

    }
    
}

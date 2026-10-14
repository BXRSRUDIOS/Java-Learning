import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sinput = new Scanner(System.in);
        System.out.println("Fav Number?");
        int a = sinput.nextInt(); // Take input - This is a comment
        System.out.println("Hello World");
        sinput.close();
    }
}

/* 

This is a multi-line comment

This is very useful for documentation



*/
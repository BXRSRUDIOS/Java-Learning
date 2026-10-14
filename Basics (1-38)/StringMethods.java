
public class StringMethods {
    public static void main(String[] args) {
        
        String name = "BXRR23";

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("X"));
        System.out.println(name.lastIndexOf("R"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("R", "Q"));
        System.out.println(name.isEmpty());
        System.out.println(name.contains("2"));
        System.out.println(name.equals("BXRR23"));
        System.out.println(name.substring(2,4));

    }    
}

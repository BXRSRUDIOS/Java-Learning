/* GOALS FOR FIRST PROJECT

Project - Madlibs 
Description - A game where a user enters in inputs of words and it generates a story
Concepts Covered - Input, Output, Variables

The Madlibs Structure I Will Use A Small Excerpt Of - https://madlibs.com/wp-content/uploads/2024/06/VacationFun_ML_2009_pg15.pdf


*/

import java.util.Scanner;

public class MadLibs {
    
    public static void main(String[] args) {
        
        // Declare Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Add Input Choices
        System.out.println("Enter Adjective 1");
        String adj1 = scanner.nextLine();

        System.out.println("Enter Adjective 2");
        String adj2 = scanner.nextLine();

        System.out.println("Enter Noun 1");
        String noun1 = scanner.nextLine();

        System.out.println("Enter Noun 2");
        String noun2 = scanner.nextLine();

        System.out.println("Enter Plural Noun 1");
        String pluralNoun1 = scanner.nextLine();

        System.out.println("Enter a Game");
        String game = scanner.nextLine();

        System.out.println("Enter Plural Noun 2");
        String pluralNoun2 = scanner.nextLine();

        System.out.println("Enter -ing Verb 1");
        String ingVerb1 = scanner.nextLine();

        System.out.println("Enter -ing Verb 2");
        String ingVerb2 = scanner.nextLine();

        // Add Output
        System.out.println("A vacation is when you take a trip to some " + adj1 + " place with your " + adj2 + " family.");
        System.out.println("Usually you go to some place that is near a/an " + noun1 + " or up on a/an " + noun2 + ".");
        System.out.println("A good vacation place is one where you can ride a/an " + pluralNoun1 + " or play " + game + " or go hunting for " + pluralNoun2 + ".");
        System.out.println("I like to spend my time " + ingVerb1 + " or " + ingVerb2 + ".");

        scanner.close();

    }

}

package testpackage;

import java.util.Scanner;

public class EnglishMainCode {



    // Method definition
    public static void englishIntroduction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("Let's Get started with your profile!");
        System.out.println("Please put in your name first!");
        String profileName = scanner.nextLine();
        System.out.println("Welcome " + profileName + "! Please put in your age next. (Note: you can only create a banking account if you are over the age of 18.");
        int profileAge = scanner.nextInt();
            if(profileAge < 18){
                System.out.println("Sorry but you are too young to create a banking account!");
            } else {
                System.out.println("Nice! ");
                System.out.println("Work in progress, testing GitHub Stuff right now! :)");
            }
    }
}
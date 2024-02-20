package testpackage;

import java.util.Scanner;


public class EnglishSignUpCode {



    // Intro Method of Sign Up of banking (English)
    // .
    public static void StartupSignupEnglish() {


        Scanner scanner = new Scanner(System.in);
        String profileLocation;

        System.out.println("|--------------------------------------------------------------------|");
        System.out.println(" ");
        System.out.println("Let's Get started with your official profile!");

        // 5 Steps to create the personal "official" (government) account. App profile with e-mail etc. will be created later.
        System.out.println("-- Step 1 / 5 --");
        System.out.println("Please put in your name first!");
        String profileName = scanner.nextLine();

        // Age input and if the age is below 18 the user will get blocked from using the app.
        System.out.println("-- Step 2 / 5 --");
        System.out.println("Welcome " + profileName + "! Please put in your age next. (Note: you can only create a banking account if you are over the age of 18.");
        int profileAge = scanner.nextInt();
        scanner.nextLine();

        if(profileAge < 18){

            System.out.println("Sorry but you are too young to create a banking account!");

        } else {

            // Last 3 steps for the official account.
            System.out.println("-- Step 3 / 5 --");
            System.out.println("Nice! Please tell us your current Location now! (Country)");
            profileLocation = scanner.nextLine();

            // Step 4: Read phone number as long
            System.out.println("-- Step 4 / 5 --");
            System.out.println("Please type in your phone number.");
            String phoneInput = scanner.nextLine(); // Read the entire line as a string
            long profilePhoneNumber = 0; // Initialize with default value
            try {
                // Remove whitespace characters from the input string
                phoneInput = phoneInput.replaceAll("\\s", "");
                profilePhoneNumber = Long.parseLong(phoneInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for phone number: \"" + phoneInput + "\". Please enter a valid long integer.");
            }

            // Step 5: Read credit/debit card number as long
            System.out.println("-- Step 5 / 5 --");
            System.out.println("Please type in your Credit / Debit Card number:");
            String cardInput = scanner.nextLine(); // Read the entire line as a string
            long profileCardNumber = 0; // Initialize with default value
            try {
                // Remove whitespace characters from the input string
                cardInput = cardInput.replaceAll("\\s", "");
                profileCardNumber = Long.parseLong(cardInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for card number: \"" + cardInput + "\". Please enter a valid long integer.");
            }

            // Close the scanner
            scanner.close();

            System.out.println(" ");
            System.out.println("Please confirm that the following information is correct and truthful!");

            // List of all information and waiting for a conformation

            System.out.println("Name: " + profileName);
            System.out.println("Age: " + profileAge);
            System.out.println("Location: " + profileLocation);
            System.out.println("Phone Number: " + profilePhoneNumber);
            System.out.println("Credit" + "/" + "Debit - Card Number: " + profileCardNumber);
            System.out.println(" ");
            System.out.println("Is this information truthful and correct? [yes / no]");


        }
    }
}
import testpackage.*;

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Intro of the program

        System.out.println("|---------------------------| NG Banking |---------------------------|");
        System.out.println("Welcome to NG Banking! Please select one of the following languages!");
        System.out.println("                            - English ");
        System.out.println("                            - German ");
        System.out.println("                          please type in:");

        System.out.print("                             ");
        String chooseLanguage = scanner.nextLine();
        if(Objects.equals(chooseLanguage, "English" )){
                System.out.println("                Thank you for choosing English!");
                System.out.println("               Do you want to [Log in] | [Sign up]");
                System.out.println("      \033[3mNote: please type in Upper Case like 'This is an example'\033[0m");


                String StartupEventChoosing = scanner.nextLine();

            if (Objects.equals(StartupEventChoosing, "Sign up")){
              EnglishSignUpCode.StartupSignupEnglish();
            } else if (Objects.equals(StartupEventChoosing,"Log in")) {
              EnglishLogInCode.StartupLoginEnglish();
            } else {
                System.out.println("Sorry but we weren't able to detect your input. Please try again in upper case [Like 'Sign up'] if you've wrote it in small letters. If you believe there is a problem please contact the Support.");
            }

        } else if (Objects.equals(chooseLanguage, "German")){
            System.out.println("             Danke das du dich für Deutsch entschieden hast!");
            System.out.println("              Jedoch ist Deutsch leider noch in der Arbeit.");
            System.out.println("|--------------------------------------------------------------------|");
        } else{
            System.out.println("Sorry but we aren't able to read what you've typed in. Please check your spelling and try again!");
        }


    }
}


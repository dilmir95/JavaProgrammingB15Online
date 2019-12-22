package day09;

import java.util.Scanner;


public class LanguagePickerSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select language 1-6");
        int languageNumber = scan.nextInt();
        String greeting = "";
        switch (languageNumber){
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Salam";
                break;
            case 3:
                greeting = "Hola";//System.out.println("Hola");
                break;
            case 4:
                greeting = "Privet";//System.out.println("Privet");
                break;
            case 5:
                greeting = "Merhaba";//System.out.println("Merhaba");
                break;
            case 6:
                greeting = "Bonjour";//System.out.println("Bonjour");
                break;
            default:
                greeting = "there is no such language";//System.out.println("there is no such language");

        }
        System.out.println(greeting+ " SDET");

    }
}

package day05;

import java.util.Scanner;


public class SkannerWay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name ?");
        String name = scan.next();
        System.out.println("my name is "+ name);

        System.out.println("What is your birth year: ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear;

        System.out.println("Your age is : "+ age );

        System.out.println("What is your heigh: ");
        double heigh = scan.nextDouble();

        System.out.println("Your height is : "+ heigh+ " ft ");

        System.out.println("How many kids do you have : ");
        int kids = scan.nextInt();
        System.out.println(" you have "+ kids+ " kids. ");

        System.out.println("Where are you from: ");
        String country = scan.next();
        System.out.println("You are from "+ country);





    }
}

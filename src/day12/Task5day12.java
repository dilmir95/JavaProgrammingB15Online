package day12;

import java.util.Scanner;

public class Task5day12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your season please");
        String season = scan.next();

        if(season.equalsIgnoreCase("spring")){
            System.out.println("Hiking, Nawruz, Allergy Season, Cool weather");
        }else if (season.equalsIgnoreCase("SUmmer")){
            System.out.println("Pool, Swimming, beach, vacation");
        }else if (season.equalsIgnoreCase("FALL")) {
            System.out.println("Just code, leaves fall, thanksgiving, halloween");
        }else if (season.equalsIgnoreCase("WINter")) {
            System.out.println("Snowboarding, Skiing, Snowman, Cold");
        }else {
            System.out.println("invalid entry");
        }

    }
}

package day05;

import java.util.Scanner;

public class TaskScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many seconds in a given hour");

        int numberOfHours = scan.nextInt();
        int numberOfSeconds = (60*60)* numberOfHours;

        System.out.println("there are "+ numberOfSeconds+ " seconds in "+ numberOfHours +" hours ");


    }
}

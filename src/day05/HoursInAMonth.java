package day05;
import java.util.Scanner;

public class HoursInAMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of hours in a given months ");
        int givenMonths = scan.nextInt();
        int numberOfHours = (30*24)* givenMonths;

        System.out.println("There are "+ numberOfHours+ " hours in "+ givenMonths+ " months");



    }
}

package day05;
import java.util.Scanner;

public class TimePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many minutes in a given day");
        int givenDay = scan.nextInt();
        int minutesInGivenDay = 1440 * givenDay;


        System.out.println("The number of minutes in "+ givenDay +
                " days equals to "+ minutesInGivenDay+ " minutes");




    }
}

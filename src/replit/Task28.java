package replit;
import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day1;
        int day = scan.nextInt();
        if (day == 1) {
            day1 = "Monday";
        } else if (day == 2) {
            day1 = "Tuesday";
        } else if (day == 3) {
            day1 = "Wednesday";
        } else if (day == 4) {
            day1 = "Thursday";
        } else if (day == 5) {
            day1 = "Friday";
        } else if (day == 6) {
            day1 = "Saturday";
        } else if (day == 7) {
            day1 = "Sunday";
            System.out.println("Sunday Funday");
        } else {
            day1 = "There is no such day";
        }

        System.out.println("Day is "+ day1);
    }
}

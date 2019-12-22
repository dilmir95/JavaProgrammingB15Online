package replit;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int itemPrice;
        int quarters;
        int dimes = 0;
        int nickels=0;
        int change;

        System.out.println("Enter price in cents:");
        itemPrice = scan.nextInt();
        change = 100 - itemPrice;
        quarters = change / 25;
        change = change%25;
        dimes = change/10;
        change = change%10;
        nickels = change/5;









        if (itemPrice % 5 != 0) {
            System.out.println("Invalid entry");
        } else if (itemPrice > 100 || itemPrice < 25) {
            System.out.println("Invalid entry");
        } else {
            System.out.println("Your change is " + quarters+"quarters, "+dimes+"dimes, and "+nickels+".");
        }


    }
}

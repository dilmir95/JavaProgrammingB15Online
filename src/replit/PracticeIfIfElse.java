package replit;
import java.util.Scanner;

public class PracticeIfIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double price;
        int drinkSelection = 1;
        String drink = "";

        System.out.println("Please select 1.(Hot) or 2.(Cold) category of drinks");
        int category = scan.nextInt();
        if (category == 1) {

            System.out.println("Select 1.Coffee or 2.Tea");
            drinkSelection = scan.nextInt();
            if (drinkSelection == 1) {
                price = 2.0;
                drink = "coffee";
                System.out.println(drink + " " + price);
            } else if (drinkSelection == 2) {
                price = 4.0;
                drink = "tea";
                System.out.println(drink + " " + price);
            } else {
                System.out.println("Invalid hot drink selection!");
            }


        }
        if (category == 2) {
            System.out.println("Select 1.Ice tea or 2.lemonade");
            drinkSelection = scan.nextInt();
            if (drinkSelection == 1) {
                price = 3.0;
                drink = "Ice tea";
                System.out.println(drink + " " + price);
            } else if (drinkSelection == 2) {
                price = 5.0;
                drink = "lemonade";
                System.out.println(drink + " " + price);
            } else {
                System.out.println("Invalid cold drink selection!");
            }



        }
        System.out.println("Thanks for shoping");
    }
}
package day05;
import java.util.Scanner;

public class GroceryActions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price of potato");

        float priceOfPotato = scan.nextFloat();
        System.out.println("How many pounds of potato you want to buy");
        int potatoCount = scan.nextInt();
        System.out.println("How much is tomato? ");
        double priceOfTomato = scan.nextDouble();
        System.out.println("How many pounds of tomato you want to buy?");
        int poundsOfTomato = scan.nextInt();
        System.out.println("How much is banana per pound? ");
        double banana = scan.nextDouble();
        System.out.println("how many pounds of banana do you want? ");

        double bananaCount = scan.nextDouble();

        System.out.println("You got "+potatoCount+" lbs potato price per lb is "
                + priceOfPotato+ "total"+ (priceOfPotato*potatoCount));
        System.out.println("You got "+ poundsOfTomato+" pounds of tomato price per lb is "
                + priceOfTomato+" total"+(priceOfTomato*poundsOfTomato));
        System.out.println("You got "+ bananaCount+" lbs of banana price per lb is "
                + banana+ " total "+ (banana*bananaCount));
        System.out.println("Your Grand Total for this purchase is "+(priceOfPotato*potatoCount
            +priceOfTomato*poundsOfTomato+banana*bananaCount)+ " $ ");
        System.out.println("Thank You for shopping with us");

        }

    }


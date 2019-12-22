package OfficeHour;

import java.util.Scanner;

public class Pracitice1126 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("do you want food(1) or drink(2)");
        String  foodOrDrink = scan.next();
        String sodaOrLemonade, burgerOrPlov;

        if(foodOrDrink.equalsIgnoreCase("FOOD")){
            System.out.println("Do you want a burger(1) or Plov(2)");
            burgerOrPlov = scan.next();
            if(burgerOrPlov.equalsIgnoreCase("burger")){
                System.out.println("Here is your Burger");
            }else if(burgerOrPlov.equalsIgnoreCase("PLOV")){
                System.out.println("Here is your Plov");
            }
        }else if(foodOrDrink.equalsIgnoreCase("drink")){
            System.out.println("Do you want a soda(1) or Lemonade(2)");
            sodaOrLemonade = scan.next();
            if(sodaOrLemonade.equalsIgnoreCase("soda")){
                System.out.println("here is your soda");
            }else if(sodaOrLemonade.equalsIgnoreCase("lemonade")){
                System.out.println("here is your lemonade");
            }
        }else {
            System.out.println("Invalid entry");
        }
    }
}

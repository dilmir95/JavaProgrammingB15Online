package replit;

import java.util.Scanner;

public class Task86 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String anotherGuest = "";
        String guestName = "";
        String guestList ="";


        do {
            System.out.println("Please enter guest name:");
                guestName = input.next();
                guestList= guestList+ guestName+", ";
            System.out.println("Do you want to enter new guest name:");
                anotherGuest = input.next();
        }while(anotherGuest.equalsIgnoreCase("yes"));

        System.out.println("Guest's list:"+ guestList.substring(0,guestList.length()-2));



    }
}

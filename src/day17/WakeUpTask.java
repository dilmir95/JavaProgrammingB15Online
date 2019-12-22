package day17;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your name");
        String name = scan.nextLine();


        String name3 = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();

        System.out.println(name3);


        String name2 = (name.charAt(0)+"").toUpperCase() + name.substring(1).toLowerCase();
            //cannot call a method for character and it needs to be comnbined with empty string to make it string

        System.out.println(name2);

        String fullName = name.substring(0,1).toUpperCase() +name.substring(1, name.indexOf(" ")).toLowerCase()
                + " "+ name.substring((name.indexOf(" ")+1), (name.indexOf(" ")+2)).toUpperCase()
                + name.substring((name.indexOf(" ")+2)).toLowerCase();

        System.out.println(fullName);
    }
}

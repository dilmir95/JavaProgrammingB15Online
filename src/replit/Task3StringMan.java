package replit;

import java.util.Scanner;

public class Task3StringMan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your full name");

        String name = scan.nextLine();


        System.out.println(name.substring(0,1)+ name.substring((name.indexOf(" ")+1),(name.indexOf(" ")+2)));

    }
}

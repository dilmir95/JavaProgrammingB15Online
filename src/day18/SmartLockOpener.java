package day18;

import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your password to enter the house");
        String password = scan.next();

        while(!password.equals("B15")){
            System.out.println("wrong password, try again");
            password = scan.next();

        }

        System.out.println("Sim Sim ochil");
    }
}

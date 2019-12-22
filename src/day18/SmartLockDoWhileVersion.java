package day18;

import java.util.Scanner;

public class SmartLockDoWhileVersion {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("knock knock");
        String password;
        do{
            System.out.println("Please enter your password");
            password = scan.next();

        }while(!password.equals("B15"));

        System.out.println("door is open");


    }
}

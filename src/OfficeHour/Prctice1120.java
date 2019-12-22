package OfficeHour;

import java.util.Scanner;

public class Prctice1120 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you version of test");
        int version = scan.nextInt();
        switch (version) {
            case 1:
                System.out.println("you have chosen a");
                break;
            case 2:
                System.out.println("you have chosen b");
                break;
            case 3:
                System.out.println("you have chosen c");
                break;
            default:
                System.out.println("incorrect entry");

        }

    }
}

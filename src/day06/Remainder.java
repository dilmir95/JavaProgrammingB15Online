package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
//        System.out.println(5 % 2);
//        System.out.println(99%10);
        Scanner scan = new Scanner(System.in);


        int minutes = scan.nextInt();
        System.out.println(minutes/60 +" hours "+ minutes% 60 + " minutes");


    }
}

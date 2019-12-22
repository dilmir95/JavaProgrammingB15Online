package replit;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        System.out.println("Enter 2 letters and find out what is in between");

        Scanner scan = new Scanner(System.in);

        String firstLetter = scan.next();
        String secondLetter = scan.next();
        char first = firstLetter.charAt(0);
        char second = secondLetter.charAt(0);

//        int a = 'a';
//        int z = 'z';
//        System.out.println(a);
//        System.out.println(z);

        if(first<second){
            for (char i = first; i <= second; ++i) {
                System.out.print(i);

            }
        }else if(first>second){
            for (char i = first; i >= second ; --i) {
                System.out.print(i);
            }
        }
    }
}

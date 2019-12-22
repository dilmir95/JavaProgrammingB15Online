package day20;

import java.util.Scanner;

public class ReversingAWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //String name = scan.nextLine();
        String name = "Big Balls";

        String reversedName = "";



        for (int i = name.length()-1; i >=0 ; --i) {
           // System.out.println(i);
            //System.out.print(i+"index: ");
            //System.out.println(name.charAt(i));
            reversedName += name.charAt(i);
        }
        System.out.println(reversedName);
    }
}

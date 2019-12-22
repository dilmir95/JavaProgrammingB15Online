package day17;

import java.util.Scanner;

public class PrintNameWithOddIndexes {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();

        int x = 0;
        int until = name.length();

        while(x<until){
            if(x%2 ==1){
                System.out.println(name.charAt(x));

            }
            ++x;
        }
    }
}

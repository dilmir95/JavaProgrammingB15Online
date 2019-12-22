package replit;

import java.util.Scanner;

public class Task87 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        if(inhabitants<=0){
            System.out.println("---- EXTINCT ----");
        }else if(inhabitants>0){
            for (int i = inhabitants; i > 0; i/=2) {
                System.out.println("Day "+day+" ["+i+"]");
                ++day;
            }
            System.out.println("---- EXTINCT ----");
        }

        /*

        example1- inhabitants is 6

        Day 0 [6]
        Day 1 [3]
        Day 2 [1]
        ---- EXTINCT ----

        example2- inhabitants is 0
        ---- EXTINCT ----
         */
    }
}

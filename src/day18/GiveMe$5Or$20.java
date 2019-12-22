package day18;

import java.util.Scanner;

public class GiveMe$5Or$20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me 5 or 20");
        int x = scan.nextInt();
       // while(x != 20 && x!=5){
        while(! (x==5 || x==20)){
            System.out.println("not the bill i want");
            System.out.println("give me 5 or 20");

            x= scan.nextInt();
        }

        System.out.println("The end");
    }
}

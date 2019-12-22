package day16;

import java.util.Scanner;

public class GiveMe5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


//        System.out.println("Give me five"   );
//
//        int num = scan.nextInt();
//        if(num !=5){
//            System.out.println("you did not give me 5!");
//
//        }
//        System.out.println("end of programm");

        int userNumber = 0;
        while (userNumber != 5){
            System.out.println("give me 5");
            userNumber = scan.nextInt();

        }
    }
}

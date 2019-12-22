package replit;

import java.util.Scanner;

public class Task108 {

    public static void main(String[] args) {


        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String star = "";
//
//        for ( i = 1; i <=n ; i++) {
//            star+= "*";
//            System.out.println(star);
//        }

        for (int k = 1; k <=n ; k++) {

            for ( j = 1; j <=k ; j++) {
                System.out.print("*");


            }
            System.out.println();
        }
    }
}

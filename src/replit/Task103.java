package replit;

import java.util.Scanner;

public class Task103 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String stairs = "";

        for (int k = 1; k <=n; k++) {
            System.out.println(stairs+= "*");


        }
    }
}

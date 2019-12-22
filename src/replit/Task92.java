package replit;

import java.util.Scanner;

public class Task92 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long factorial = 1;
        for (long i = 1; i <= 50; i++) {
            factorial=factorial*i;
            if(i==n){
                System.out.println(factorial);
            }

        }

    }
}

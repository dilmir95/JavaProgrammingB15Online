package replit;

import java.util.Scanner;

public class Task83 {

    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if (isPremiumCustomer) {
            if (nbooksPurchased >= 8) {
                freeBooks = 2;
                System.out.println(freeBooks);
            } else if (nbooksPurchased >= 5) {
                freeBooks = 1;
                System.out.println(freeBooks);
            } else {
                System.out.println(freeBooks);
            }
        } else if (!isPremiumCustomer) {
            if (nbooksPurchased >= 12) {
                freeBooks = 2;
                System.out.println(freeBooks);
            } else if (nbooksPurchased >= 7) {
                freeBooks = 1;
                System.out.println(freeBooks);
            } else {
                System.out.println(freeBooks);
            }

        }
    }
}
package replit;

import java.util.Scanner;

public class Task119 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        String[] splitEmail = email.split("@");
        int atCount = 0;
        for (int i = 0; i <= email.length() - 2; i++) {
            String charCount = email.substring(i, i + 1);
            if (charCount.equals("@")) {
                ++atCount;

            }
        }
        if (atCount == 0 || atCount > 1) {
            System.out.println("invalid email");
        } else {
            System.out.println("Email id: " + splitEmail[0]);
            System.out.println("Email domain: " + splitEmail[1]);

        }
    }
}
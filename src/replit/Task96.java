package replit;

import java.util.Scanner;

public class Task96 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        int lastSeparatorLength = separator.length();
        String combined = "";

        for (int i = 1; i <= count; i++) {
             combined+=(word+separator);
        }
        System.out.print(combined.substring(0, combined.length()-lastSeparatorLength));
    }
}

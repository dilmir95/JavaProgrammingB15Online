package replit;

import java.util.Scanner;

public class Task99 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String chars = "";
        int accourance = 0;

        for (int i = 0+n; i < str.length()-n; i++) {
            chars = str.substring(i, i+n);
            if(str.substring(0,0+n).equals(chars)){
                ++accourance;
            }
        }

        System.out.println(accourance);
        /*
                Example:
        input: abXYabc
        input: 1
        output: true
        a appears twice
         */
    }
}

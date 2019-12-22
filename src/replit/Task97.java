package replit;

import java.util.Scanner;

public class Task97 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        int javaCount = 0;
        String java = "";

        for (int i = 0; i <= word.length()-4; i++) {
            java = word.substring(i, i+4);
            if(java.equalsIgnoreCase("java")){
                ++javaCount;
            }

        }
        System.out.println(javaCount);
    }
}

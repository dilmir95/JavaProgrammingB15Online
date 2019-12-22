package replit;

import java.util.Scanner;

public class Task100 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String bread = "";
        int breadCount = 0;

        String middleWord = "";
        for (int i = 0; i <= str.length() - 5; i++) {
            bread = str.substring(i, i + 5);
            if (bread.equals("bread")) {
                ++breadCount;
            }

        }
        if(breadCount>=2){


            middleWord = str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
            System.out.println(middleWord);
        }else {
            System.out.println("nothing");
        }
    }
}
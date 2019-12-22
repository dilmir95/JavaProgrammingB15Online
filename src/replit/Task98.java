package replit;

import java.util.Scanner;

public class Task98 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int hiCount = 0;
        String hi= "";

        for (int i = 0; i <=str.length()-2 ; i++) {
            hi = str.substring(i, i+2);
            if(hi.equalsIgnoreCase("hi")){
                ++hiCount;
            }
        }
        System.out.println(hiCount);
    }
}

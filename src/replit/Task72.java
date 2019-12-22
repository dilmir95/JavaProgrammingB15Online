package replit;

import java.util.Scanner;

public class Task72 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here
        int without = txt.length()-1;
        String y = txt.substring(0, without);
        System.out.println(y);
    }
}

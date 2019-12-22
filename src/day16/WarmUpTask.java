package day16;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1 = scan.next();

        String word2 = word1.charAt(3)+""+word1.charAt(2)+word1.charAt(1)+word1.charAt(0)   ;

        System.out.println(word2);

        String msg = "hello";

        System.out.println(msg += "world");
    }

}

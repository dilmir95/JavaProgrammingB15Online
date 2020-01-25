package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task210 {

    public static void main(String[] args) {

        String word = "a,b$v";
        String result = "";
        String result1 = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            if (Character.isLetter(word.charAt(i))) {
                result += word.charAt(i);
            }

        }
        System.out.println(result);
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
               result1+= result.charAt(index);
               ++index;
            } else {
                result1 += word.charAt(i);
            }


        }
        System.out.println(result1);
    }
}
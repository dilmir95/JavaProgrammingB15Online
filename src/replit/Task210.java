package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task210 {

    public static void main(String[] args) {

        String word = "a,b$c";

        char[] chars = word.toCharArray();
        String result = "";

        for (int i = chars.length-1; i >=0 ; i--) {
            if(Character.isLetter(chars[i])){
                result+= chars[i];
            }
        }

        int index = 0;

        for (int i = 0; i <chars.length ; i++) {
            if(Character.isLetter(chars[i])){
                if(Character.isLetter(chars[i])){
                    
                }
            }
        }

    }
}

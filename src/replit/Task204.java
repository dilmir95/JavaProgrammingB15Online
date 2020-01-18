package replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task204 {

    public static void main(String[] args) {



    }

    public static boolean isAnagram (String word1 , String word2){


        char[] word1Char = word1.toUpperCase().toCharArray();
        char[] word2Char = word2.toUpperCase().toCharArray();

        Arrays.sort(word1Char);
        Arrays.sort(word2Char);

        if(Arrays.equals(word1Char, word2Char)){
            return true;
        }


        return false;
    }
}

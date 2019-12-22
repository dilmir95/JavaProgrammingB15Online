package replit;

import java.util.Arrays;

public class Task140 {

    public static void main(String[] args) {

        String[] words = {"Hello","why","by","apple","note"};

        String[] updated = new String[words.length];
        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                updated[i]= ""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);

            }
        }
        System.out.println(Arrays.toString(updated));
    }
}

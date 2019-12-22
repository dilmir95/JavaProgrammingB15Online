package day26;

import java.util.Arrays;

public class ReversingAStringArray {

    public static void main(String[] args) {

        String sentence = "My name is Dilmurod and I love Java";

        String[] words = sentence.split(" ");
            int lastIndex = words.length-1;
        for (int x = 0; x <words.length/2 ; x++) {
            String temp = words[x];
            words[x]= words[lastIndex-x];
            words[lastIndex-x]=temp;
        }

        System.out.println(Arrays.toString(words));
    }
}

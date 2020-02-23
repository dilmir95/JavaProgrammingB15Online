package day63;

import java.util.*;

public class WordFrequency {

    public static void main(String[] args) {

        String str = "Finding word frequence sounds fun, because fun in when count words word word I already know word can" +
                "be long or short but word is a word";

        Map<String, Integer> mapStr = new HashMap<>();
        String[] words = str.split(" ");

        for (int i = 0; i <words.length ; i++) {
            if(!mapStr.containsKey(words[i])){
                mapStr.put(words[i],1);
            }else{
                mapStr.replace(words[i],mapStr.get(words[i])+1);

            }
        }

        System.out.println(mapStr);
    }
}

package day63;

import java.util.*;

public class FrequencyCharMap {

    public static void main(String[] args) {

        String str = "AAABBBBBBCCCCRRRGGGDD";



        Map<Character, Integer>  freqMap = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            if(!freqMap.containsKey(str.charAt(i))){
                freqMap.put(str.charAt(i),1);
            }else{
                freqMap.replace(str.charAt(i),freqMap.get(str.charAt(i))+1);

            }
        }

        System.out.println(freqMap);


        String str1 = "fsijbnfSOJBNvjdbDDDDDDDDJANJAJANJANANANAASU";

        Map<Character,Integer> mapChar = new HashMap<>();
        for (int i = 0; i <str1.length() ; i++) {
            if(!mapChar.containsKey(str1.charAt(i))){
                mapChar.put(str1.charAt(i),1);
            }else {
                mapChar.replace(str1.charAt(i),mapChar.get(str1.charAt(i))+1);

            }
        }

        System.out.println(mapChar);
    }
}

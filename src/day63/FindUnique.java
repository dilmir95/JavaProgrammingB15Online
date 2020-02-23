package day63;

import java.util.*;

public class FindUnique {

    public static void main(String[] args) {

        String str = "The new link for joining class will require you to login to Okta, if it ask you to sign in " +
                ", please just click on it , it will take you too Okta signin page , once you signin with Okta" +
                "Then you will be able to join right away. PLEASE DO NOT TRY TO REGISTER , THE LINK IS ALREADY IN THE EMAIL" +
                "Click to join";


        String[] chars = str.split("");
        String result = "";
        for (int i = 0; i <chars.length ; i++) {
            if(!result.contains(""+ chars[i])){
                result+= chars[i];
            }
        }
        System.out.println(result);
        System.out.println(result.length());


        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            set2.add(str.charAt(i));
        }

        System.out.println(set2);
        System.out.println(set2.size());

        //Set<Character> chars1 =  new HashSet<>(Arrays.asList(str.toCharArray()));

        String[] eachChar = str.split("");
        List<String> lst1 = new ArrayList<>(Arrays.asList(eachChar));

        Set<String> strSet = new HashSet<>(lst1);
        System.out.println(strSet);

        //one shot
        Set<String> setStr1 = new HashSet<>(Arrays.asList( str.split("")));
        System.out.println(setStr1);

    }
}

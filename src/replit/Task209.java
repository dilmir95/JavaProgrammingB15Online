package replit;

import java.util.concurrent.ConcurrentHashMap;

public class Task209 {

    public static void main(String[] args) {

        System.out.println(extractNum("abs23"));

    }

    public static String extractNum(String s) {

        String result = "";

        char[] schars = s.toCharArray();


        for (int i = 0; i <schars.length ; i++) {
            if(Character.isDigit(schars[i])){
                result+= schars[i];
            }
        }
        return result;
    }
}
package OfficeHour;

import jdk.swing.interop.SwingInterOpUtils;

public class Practice_12_23 {

    public static void main(String[] args) {

        reverseAString("Dilmurod"); // do not do it like this it will not print, save it to a variable and print
        System.out.println(reverseAString("I love java"));
    }

    public static String reverseAString (String word){
            String reversed ="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+= word.charAt(i);
        }
        return reversed;
    }
}

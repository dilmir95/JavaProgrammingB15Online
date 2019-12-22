package day25;

import java.util.Arrays;

public class StringToCharArray {

    public static void main(String[] args) {

        String name = "Dilmurod";

       char[] namesChar = new char[name.length()] ;
//       namesChar[0]  = name.charAt(0);
//       namesChar[1]= name.charAt(1);

        for (int i = 0; i <=name.length()-1 ; i++) {
            namesChar[i]= name.charAt(i);

        }
        System.out.println("Names char"+ Arrays.toString(namesChar));
//        System.out.println(namesChar);

        char[] namesChars2 = name.toCharArray();
        System.out.println("namesChars2 = " + Arrays.toString(namesChars2));




    }
}

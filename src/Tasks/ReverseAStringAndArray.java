package Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAStringAndArray {

    public static void main(String[] args) {


        String name = "Dilmurod Yakubov";

        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
        String sentence = "I love java and I am from Uzbekistan";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int lastIndex = words.length-1;
        for (int i = 0; i <words.length/2 ; i++) {
            String temp = words[i];
            words[i]= words[lastIndex-i];
            words[lastIndex-i]= temp   ;

        }
        System.out.println(Arrays.toString(words));

        String lastName = "Yakubov";
        char[] eachChar = new char[lastName.length()];
        for (int i = 0; i <lastName.length() ; i++) {
            eachChar[i]= lastName.charAt(i);

        }
        System.out.println(Arrays.toString(eachChar));

        String car = "Ford";
        char[] eachChars = car.toCharArray();
        System.out.println(Arrays.toString(eachChars));
    }


}

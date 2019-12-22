package day29;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FillingUpArrayWithEvenNumber {

    public static void main(String[] args) {

        int[] number    = new int [100];

        for (int i = 0; i <number.length ; i++) {
            number[i]= (i*2);

        }
        System.out.println(Arrays.toString(number));
        System.out.println("=========================================");
        String[] java = new String[300];
        for (int i = 0; i <java.length ; i++) {
            java[i]= "I love Java";

        }
        System.out.println(Arrays.toString(java));

    }
}

package OfficeHour;

import java.util.Arrays;

public class Practice1212 {

    public static void main(String[] args) {

        char[] newCHar = {'a', 'f', 'e', 'r', 'c'};

        System.out.println(Arrays.toString(newCHar));

        Arrays.sort(newCHar);
        System.out.println(Arrays.toString(newCHar));

        String alp = "Abcd";
        String[] chars= alp.split("");
        System.out.println(Arrays.toString(chars));

    }
}

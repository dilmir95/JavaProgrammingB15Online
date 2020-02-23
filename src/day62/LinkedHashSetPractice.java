package day62;

import java.util.LinkedHashSet;
import java.util.*;

public class LinkedHashSetPractice {

    public static void main(String[] args) {

        Set<Integer> myNumbers = new LinkedHashSet<>();
        myNumbers.add(10);
        myNumbers.add(10);
        myNumbers.add(11);
        myNumbers.add(1012);
        myNumbers.add(1021);
        myNumbers.add(140);


        System.out.println(myNumbers);

        //linked hashset keep the insertion order

    }
}

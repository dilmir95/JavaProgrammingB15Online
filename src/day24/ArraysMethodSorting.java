package day24;

import java.util.*;

public class ArraysMethodSorting {

    public static void main(String[] args) {

        int[] scores = {99,5,76,212,4321,3131}  ;

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[0]);

        String[] superHeroes = {"Superman", "Batman", "Wonder Woman","Hulk", "Spider Man"};

        System.out.println(Arrays.toString(superHeroes));
        Arrays.sort(superHeroes);
        System.out.println(Arrays.toString(superHeroes));


        //sort method does not work with boolean array;

    }
}

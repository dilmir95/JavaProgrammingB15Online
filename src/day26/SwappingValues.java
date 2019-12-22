package day26;

import day06.UsingTheValueOfOtherVariable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwappingValues {

    public static void main(String[] args) {

       String name1 = "Emma";
       String name2 = "Jason";

       String temp = name1;

       name1 = name2;
       name2=temp;
        System.out.println("name1 "+name1);
        System.out.println("name2 " + name2);

        int[] myNumbers = {10,40,30,7};

//        int tempor = myNumbers[0];
//
//        myNumbers[0]= myNumbers[3];
//
//        myNumbers[3]= tempor;

        //System.out.println(Arrays.toString(myNumbers));



        int temporary = myNumbers[1];
        myNumbers[1]= myNumbers[2];
        myNumbers[2]=temporary;

        //System.out.println(Arrays.toString(myNumbers));



    }
}

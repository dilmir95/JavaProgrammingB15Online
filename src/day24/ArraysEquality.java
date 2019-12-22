package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args) {

        int[] scores = {2,4,6,8,3,9,11,7};

        int[] scores1 = {20,4,61,8,32,9,11,7};

        int[] scores2 = {2,4,6,8,3,9,11,7};

        System.out.println(scores==scores1); //false
        System.out.println(scores==scores2); //false


        boolean isScoreAndScore1Equal = Arrays.equals(scores,scores1);
        System.out.println(isScoreAndScore1Equal);
        boolean isScoreAndScore2Equal = Arrays.equals(scores,scores2);
        System.out.println(isScoreAndScore2Equal);


        //order of the array does matter when checking equality



            //to check array equality we need to use .equals method;


    }
}

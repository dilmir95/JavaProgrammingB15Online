package day26;

import java.util.Arrays;

public class FindLastIndexOfArray {

    public static void main(String[] args) {

        int[] myNumbers= {10,40,30,7};

        int size = myNumbers.length; // size of the arrray

        int lastItem = myNumbers[myNumbers.length-1];
//        System.out.println(lastItem);
//        System.out.println(myNumbers[2]);

//        myNumbers[1]= myNumbers[1]+1;
//        myNumbers[1]= myNumbers[1]*2;
//        System.out.println(Arrays.toString(myNumbers));
//        Arrays.sort(myNumbers);
//        System.out.println(Arrays.toString(myNumbers));
//
        myNumbers[2]= myNumbers[0]+myNumbers[1];
        System.out.println("new value of third item "+ myNumbers[2]);

        int temp = myNumbers[3];
        myNumbers[0]= myNumbers[temp];
        myNumbers[3]= myNumbers[0];

        System.out.println(Arrays.toString(myNumbers));

    }

}

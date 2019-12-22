package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {

    public static void main(String[] args) {

        int[] myNumbers = new int[]{5,3,21,2,1,13,8};

        System.out.println(Arrays.toString(myNumbers));
        int lastIndex = myNumbers.length-1;

        for (int x = 0; x <myNumbers.length/2 ; x++) {
            int tempp = myNumbers[x];
            myNumbers[x]= myNumbers[lastIndex-x];
            myNumbers[lastIndex-x]= tempp;
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}

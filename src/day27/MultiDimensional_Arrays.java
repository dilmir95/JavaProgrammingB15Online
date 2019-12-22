package day27;

import java.util.Arrays;

public class MultiDimensional_Arrays {

    public static void main(String[] args) {

        //Multidimensional array is array that contains another array or arrays
        // x dimensional array contains x-1 dimensional arrays
        int[] arr1D = {1,2,3,4,5};

        int[][] arr2D = {  {1,2,3,4,5},   {4,6,7,8,9}    };
        //     index            0               1

        System.out.println(arr2D.length);  //2
        System.out.println(Arrays.toString(arr2D[0]));


        System.out.println(arr2D[0][2]); //3 3rd item in 1 st array;

        //to print multi dimensional arrays we cannot use arrays to string to see
        // we use Arrays.deepToString()

        System.out.println(Arrays.deepToString(arr2D));
    }
}

package day29;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FillingUpArrayValue {

    public static void main(String[] args) {

        int[] numbers = new int[100];

        //System.out.println(Arrays.toString(numbers));
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]  =i+1;
        }
        System.out.println(Arrays.toString(numbers));

        int[][] scores = {{12,12,43,41},{21,65,86,23},{21,67,32,12}};
        for (int i = 0; i <scores.length ; i++) {
            for (int j = 0; j <scores[i].length ; j++) {
                System.out.print("Cell("+(i+1)+","+(j+1)+") ="+ scores[i][j]);
            }
            System.out.println();
        }
    }
}

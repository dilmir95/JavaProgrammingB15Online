package day27;

import java.util.Arrays;

public class MultiDimensional3D {

    public static void main(String[] args) {

        //2d array
        int[][] babyAges = {{1,2,3,4,5},{6,7,8,9}};
        int[][] adultAges = {{18,19,20,21},{25,30,60,45}};

        int[][][] ages = {babyAges, adultAges};

        for(int[][] each2D : ages){
            for (int[] each1D: each2D){
                for (int eachNum : each1D   ){
                    System.out.print(eachNum+" ");
                }
            }
        }
        System.out.println();
        System.out.println((ages[0][1][1]));

        System.out.println("===================================");

        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                for (int k = 0; k <ages[i][j].length ; k++) {
                    System.out.print(ages[i][j][k]+" ");
                }
            }
        }
    }
}

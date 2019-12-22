package day27;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArrayLoop {

    public static void main(String[] args) {

        int[][] numbers = { {1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i <numbers.length ; i++) {
            //System.out.println(Arrays.toString(numbers[i]));
            System.out.print(Arrays.toString(numbers[i]));
            System.out.println(" this arrays contains these elements below");
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ,");
            }
            System.out.println();
        }
        System.out.println("=============================================");

        int[][] ages = { {10}, {12,13,14,16,17},{19,29,21,22,23}};

        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if(ages[i][j]%2==1){
                    continue;
                }else{
                    System.out.println("These are the even numbers: "+ ages[i][j]);
                }
            }
        }
        System.out.println("==========================================");
            // nested for each loop with multi dimensional array;
        int[][] arr2D = { {10,20,30},{40,50,60,70,80,90,100}};
        for(int [] each1D: arr2D){
            //System.out.println(Arrays.toString(each1D));
            for(int element: each1D){
                System.out.print(element+" , ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
        String[][] names = {{"Dilmurod","Dil","Shoxsanam"},{"Shox","Sanam","Dilmir"}};

        for(String[] eachArray : names){
            for(String eachName: eachArray){
                //System.out.println(eachName);
                if(eachName.equals("Shoxsanam")){
                    System.out.println(eachName.replace("Shoxsanam","Egov"));
                }
            }

        }
        System.out.println(Arrays.deepToString(names));
    }

}

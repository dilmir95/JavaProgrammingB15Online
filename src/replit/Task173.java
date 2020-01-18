package replit;

import java.util.Arrays;

public class Task173 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{5,77,2}};

        int max= arr[0][0];

        for(int[] eachArray: arr){
            for (int eachNum: eachArray){
                if(max<eachNum){
                    max=eachNum;
                }
            }
        }
        System.out.println("max = " + max);

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
            arr[i][j]=max;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}

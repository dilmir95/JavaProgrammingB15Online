package replit;

import java.util.*;

public class Task142 {

    public static void main(String[] args) {

//        Scanner inp = new Scanner(System.in);
//        int rows = inp.nextInt(), cols = inp.nextInt();
//        int[][] arr = new int[rows][cols];
//        for(int i=0 ;i<=rows-1;i++)
//        {
//            for(int j=0 ;j<=cols-1;j++)
//            {
//                arr[i][j]=inp.nextInt();
//            }//end for cols
//        }//end for rows


        int[] rows = {12,131,51};
        int[] column = {11,32,45};




            int[][] arr = {rows,column};

        int max = arr[0][0];
            for(int[] eachArray: arr){
                for(int eachNum: eachArray){
                    if(max<eachNum){
                        max=eachNum;
                    }
                }
            }
        System.out.println(max);

    }
}

package replit;

import java.util.Scanner;

public class Task172 {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
//                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
//                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
//        };
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {9, 8, 9}};


        int result = 0;
        int sumLeft = 0;
        int sumRight = 0;
        int index = 0;
        int indexOpp = 2;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumLeft += matrix[index][index];
                break;
            }
            ++index;
        }
        index=0;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                sumRight += matrix[index][indexOpp];

                break;
            }
            indexOpp--;
            ++index;
        }

       //System.out.println(sumLeft);
        //System.out.println(sumRight);
        result=sumLeft-sumRight;
        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}

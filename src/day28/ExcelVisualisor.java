package day28;

import java.util.Arrays;

public class ExcelVisualisor {

    public static void main(String[] args) {

        //int[] row1 = new int[]{78,54,100,84}    ;
        int[][] excelSheet = { {78,54,100,84},{33,44,77,123},{12,88,52,76},{67,33,98,67}
                                ,{12,88,52,45},{67,33,98,34} };

        for (int i = 0; i <excelSheet.length ; i++) {
            for (int j = 0; j <excelSheet[i].length ; j++) {
                System.out.print("Cell("+(i+1)+","+(j+1)+") = "+ excelSheet[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(excelSheet));
    }
}

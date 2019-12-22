package day28;

public class Excel {

    public static void main(String[] args) {

        int[][] sheets = {{43,55,77,88,12},{12,32,54,78,98},{211,213,654,23,11},{77,88,90,21,7}};

        for (int i = 0; i <sheets.length ; i++) {
            for (int j = 0; j <sheets[i].length ; j++) {
                System.out.print("Cell("+(i+1)+","+(j+1)+") = "+sheets[i][j]+" ");
            }
            System.out.println();
        }
    }
}

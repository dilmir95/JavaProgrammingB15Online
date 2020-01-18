package replit;

import java.util.Arrays;

public class Task171 {

    public static void main(String[] args) {

        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for (int i = 0; i <8 ; i++) {
            int index = 0;
            for (char j = 'a'; j <='h' ; j++) {
                chessBoard[i][index]= ""+(i+1)+j;
                ++index;
            }
        }
        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}

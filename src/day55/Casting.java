package day55;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;

public class Casting {

    public static void main(String[] args) {

    int[][] n = {{1,3},{2,3}};
    for (int i = n.length-1;i>=0; i--){
        for(int y : n[i]){
            System.out.println(y);
        }
    }
      String stuff = "TV";
    String res = null;
        res = stuff.equals("TV")? "Walter" : stuff.equals ("Movie")? "White" : "No Result";

        System.out.println(res);

        int i=0;
        for (i=0 ;i<=3;){
            i++;
        }
        System.out.println(i);












    }

}

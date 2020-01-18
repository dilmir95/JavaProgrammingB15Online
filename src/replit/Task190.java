package replit;

import java.util.Arrays;

public class Task190 {

    public static void main(String[] args) {
        int[] x = {12,12,41,56,78};
        int[] y = {21,21,32,12,44,65};
        System.out.println(Arrays.toString(mergR(x,y)));
    }
    public static int[] mergR(int[] a,int[] b) {

        int newLength = a.length + b.length;
        int[] merged = new int[newLength];
        int count =0;
        for(int i: a){
            merged[count]=i;
            ++count;
        }
        for(int j: b){
            merged[count]=j;
            ++count;
        }
        return merged;

    }//end mergR
}

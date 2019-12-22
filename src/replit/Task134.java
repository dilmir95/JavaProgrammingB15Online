package replit;

import java.util.*;

public class Task134 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for(int i =0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for(int j =0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        //System.out.println(Arrays.toString(outer));
        //System.out.println(Arrays.toString(inner));

        int trueCount=0;
        for (int x = 0; x <inner.length ; x++) {
            for (int g = 0; g <outer.length ; g++) {
                if(inner[x]==outer[g]){
                    ++trueCount;
                }
            }
        }
        if(trueCount>=sizeInner){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

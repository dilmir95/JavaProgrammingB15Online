package replit;

import java.util.*;

public class Task130 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < size; i++){
            nums[i] = scan.nextInt();
        }

        int[] modified = new int [size];
        modified[modified.length-1]= nums[0];

        for (int i = 0; i <modified.length-1 ; i++) {
                modified[i]= nums[i+1];
        }
        System.out.println(Arrays.toString(modified));
    }
}

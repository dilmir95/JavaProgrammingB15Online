package replit;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task124 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i <=(nums.length-1)/2 ; i++) {
            int temp = nums[i];
            nums[i]= nums[(nums.length-1)-i];
            nums[(nums.length-1)-i]= temp;
        }


        int[] numbers = {1,2,3,4,5,6,7};



    }
}

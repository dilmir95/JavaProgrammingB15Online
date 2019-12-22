package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task122 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};


       // Arrays.sort(nums);
        for (int i = 0; i <= nums.length-1 ; i++) {
            int count=0;
            for (int j = 0; j <= nums.length-1 ; j++) {
                if(nums[j]== nums[i]){
                    count++;
                }

                }
            if(count==1){
                System.out.println(nums[i]);
                break;

            }

        }



    }
}
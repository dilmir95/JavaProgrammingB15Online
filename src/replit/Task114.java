package replit;

import java.util.Scanner;

public class Task114 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
            int sum = 0;
        for (int i = 0; i <= nums.length-1 ; i++) {
            sum+= nums[i];

        }
        System.out.println(sum);
    }
}

package replit;

import java.util.Scanner;

public class Task121 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        int countOfEven = 0;
        for (int i = 0; i <=nums.length-1 ; i++) {
            if(nums[i]%2==0){
                ++countOfEven;

            }
        }
        System.out.println(countOfEven);
    }
}

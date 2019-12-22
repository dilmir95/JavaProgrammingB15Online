package replit;

import java.util.Scanner;

public class Task113 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
            int sumOfEven=0;

        for (int j = 0; j <=nums.length-1 ; j++) {
            if(nums[j]%2==0){
                ++sumOfEven;

            }
        }
        System.out.println(sumOfEven);
    }
}

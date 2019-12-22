package replit;

import java.util.Arrays;

public class Task139 {

    public static void main(String[] args) {

        int[] num = {1};
        int sizes = 0;
        if(num.length>=2){
            sizes=2;
        }else if(num.length<2)
            sizes=1;
        int[] nums = new int[sizes];

        for (int i = 0; i <nums.length ; i++) {
            nums[i]= num[i];
        }
        System.out.println(Arrays.toString(nums));

    }
}

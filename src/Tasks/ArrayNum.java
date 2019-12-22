package Tasks;

import java.util.*;


public class ArrayNum {

    public static void main(String[] args) {

        int[] nums = {14,56,78,32,12,99,54,23};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int max= nums[0];
        int min = nums[0];

        for (int num: nums) {
            if(max<num  ){
                max=num;
            }else if (min>num){
                min=num;
            }
        }
        System.out.println(min+" is minimum");
        System.out.println(max+ " is maximum ");

    }
}

package day36;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MethodWithParameterArray {

    public static void main(String[] args) {

        int[] nums = {1,5,7,3,9,0};
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));


        changeArrayFirstItemTo100(nums);

        long[] numbers = {100l,30l,1234l,21451l,453114l};

        swap(numbers);

    }

    public static void changeArrayFirstItemTo100(int[] numbers){

        numbers[0]=100;
        System.out.println(Arrays.toString(numbers));
    }


    public static void swap(long[] nums){
        long temp = nums[0];
        nums[0]= nums[nums.length-1];

        nums[nums.length-1]= temp;
        System.out.println(Arrays.toString(nums));
    }
}

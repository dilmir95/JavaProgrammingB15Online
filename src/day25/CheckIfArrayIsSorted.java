package day25;

import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {


        int[]   nums = {1,2,3,40,5,6};

        int[] numsCopy = {nums[0], nums[1],nums[2],nums[3],nums[4],nums[5]};
//
//        for (int i = 0; i <=nums.length-1 ; i++) {
//            numsCopy[i]= nums[i];
//        }
//
//        System.out.println("Nums Copy "+ Arrays.toString(numsCopy));
//
//        Arrays.sort(numsCopy);
//        if(Arrays.equals(nums,numsCopy)){
//            System.out.println("this array is sorted");
//        }else {
//            System.out.println("this array is not sorted");
//        }
            boolean isAlreadySorted = true;

        for (int i = 0; i <= nums.length-2; i++) {
            if(nums[i]>nums[i+1]){
                System.out.println("It is not sorted");
                isAlreadySorted = false;


                break;
            }

        }
        System.out.println("Is already sorted: "+ isAlreadySorted);

    }
}

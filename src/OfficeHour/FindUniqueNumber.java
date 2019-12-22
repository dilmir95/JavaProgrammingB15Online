package OfficeHour;

import java.util.Arrays;

public class FindUniqueNumber {

    public static void main(String[] args) {

        int[] numbers = {1,1,2,2,3,4,4,5,5};
        for (int j = 0; j <numbers.length ; j++) {


            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == numbers[j]) {
                    ++count;
                }
            }
            if (count == 1) {
                System.out.println(numbers[j]);
            }
        }


        System.out.println("===================");
        String letters = "AABCC";
        String[] arr = letters.split("");
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j <arr.length ; j++) {


            int count1 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(arr[j])) {
                    ++count1;

                }
            }
            if (count1 == 1) {
                System.out.println(arr[j]);
            }
        }

        System.out.println("===================");
        int[] nums = {1,2,3,4,5,6,7};

        int max = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>max){
                max=nums[i];

            }
        }
        System.out.println("max = " + max);
        int secondMax = nums[0];
        for(int eachNum : nums){
            if(eachNum==max){
                continue;
            }
            if(eachNum>secondMax){
                secondMax=eachNum;
            }
        }
        System.out.println("secondMax = " + secondMax);

        System.out.println("===============================");

        //swap variables values
        int a = 10;
        int b = 20;

        a = a+b; //10+20 a=30
        b = a-b;    // 30-20 b = 10;
        a = a-b;        //30-10 a=20

        //divide two numbers without using division operator


    }
}

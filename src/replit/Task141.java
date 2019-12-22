package replit;

import java.util.*;

public class Task141 {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        int size = scan.nextInt();
//        int[] nums = new int[size];
//        for(int i =0; i < size; i++) {
//            nums[i] = scan.nextInt();
//        }
        int[] nums = {4,5,6};

        int[] numbers = new int[nums.length*2];
        for (int i = 0; i <numbers.length-1 ; i++) {
            numbers[i]=0;
            numbers[numbers.length-1]=nums[nums.length-1];
        }
        System.out.println(Arrays.toString(numbers));
    }
}

package day38;

import java.util.*;

public class RetainAll {

    public static void main(String[] args) {

        List<Integer > nums = new ArrayList<>(Arrays.asList(100,200,300,400,500,600));


        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));


        nums.retainAll(nums2);


        System.out.println("nums = " + nums);


        System.out.println(nums.equals(nums2));
    }
}

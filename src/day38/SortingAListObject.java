package day38;

import java.util.*;



public class SortingAListObject {

    public static void main(String[] args) {

        List<Integer > nums = new ArrayList<>(Arrays.asList(300,600,100,400,500,200));


        //2 ways to sort an Array Object
        //use collections utility class
        Collections.sort(nums);

        System.out.println(nums);
        Collections.sort(nums , Comparator.reverseOrder());
        //Collections.sort(nums1, Collections.reverseOrder());
        System.out.println(nums);

        nums.sort(Comparator.naturalOrder());

        System.out.println(nums);

        Collections.sort(nums); //same as nums.sort(Comparator.naturalOrder());

    }
}

package day36;

import java.util.ArrayList;

public class FindingUniqueUsingArrayList {

    public static void main(String[] args) {

        int[] nums = {11,33,44,11,33,44,22,55,44,33};

        ArrayList<Integer> uList = new ArrayList<>();

        for(int each: nums){
            if(!uList.contains(each)){
                uList.add(each);
            }
        }
        System.out.println(uList);
    }
}

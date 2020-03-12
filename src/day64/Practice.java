package day64;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class Practice {

    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5};

        int lastIndex = nums.length-1;

        for (int i = 0; i <nums.length/2 ; i++) {
            int temp = nums[i];
            nums[i] = nums[lastIndex];
            nums[lastIndex] = temp;

            --lastIndex;

        }

        System.out.println(Arrays.toString(nums));


        StringBuilder a = new StringBuilder("Dilmurod");

        StringBuilder reverseA = a.reverse();
        System.out.println(reverseA.toString());


        String findFreq = "aaaabbbbbffffwwwwwqqqqq";
        int count;
        String result = "";
        for (int i = 0; i <findFreq.length() ; i++) {


            if(!result.contains(findFreq.charAt(i)+"")){
                result+= findFreq.charAt(i);
            }
        }



        for (int i = 0; i <result.length() ; i++) {
            count=0;
            for (int j = 0; j <findFreq.length() ; j++) {
                if(result.charAt(i)==findFreq.charAt(j)){
                    ++count;
                }
            }

            System.out.println(result.charAt(i)+""+count);
        }


        Map<String,Integer> findFreqOfChars = new HashMap<>();
        String[] arrChar = findFreq.split("");

        for (String each: arrChar){
            if(!findFreqOfChars.containsKey(each)){
                findFreqOfChars.put(each,1);
            }else{
                findFreqOfChars.replace(each,findFreqOfChars.get(each)+1);
            }


        }

        System.out.println(findFreqOfChars);

    }
}

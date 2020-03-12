package CodingBat;

import java.util.*;

public class Freq {

    public static void main(String[] args) {

        String abc = "ABCCCSSSSAAABBBCCC";
           int count;
           String result="";

        for (int i = 0; i <abc.length() ; i++) {
            if(!result.contains(""+abc.charAt(i))){
                result+= abc.charAt(i);
            }
        }

        System.out.println(result);

        for (int i = 0; i <result.length() ; i++) {
            count=0;
            for (int j = 0; j <abc.length() ; j++) {
                if(result.charAt(i)==abc.charAt(j)){
                    ++count ;

                }
            }
            System.out.println(result.charAt(i)+""+count);
        }

        Map<String, Integer>  freqCount = new HashMap<>();
        for(String each: abc.split("")){
            if(!freqCount.containsKey(each)){
                freqCount.put(each,1);
            }else{
                freqCount.replace(each,freqCount.get(each)+1);
            }

        }

        System.out.println(freqCount);


        String name = "Shoxsanam";

        String reverseName = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            reverseName+= name.charAt(i);

        }

        System.out.println(reverseName);


        int[] nums = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(nums));

        int lastIndex = nums.length-1;
        int count1 = lastIndex;

        for (int i = 0; i <nums.length/2 ; i++) {
            int temp= nums[i]   ;
            nums[i] = nums[lastIndex];
            nums[lastIndex]= temp;
            --lastIndex;


        }
        System.out.println(Arrays.toString(nums));

















        int[] numbers= {10,9,8,7,6,5,4,3,2,1};

        int lastIndex1 = numbers.length-1;

        for (int i = 0; i <numbers.length/2 ; i++) {
            int tempor = numbers[i];
            numbers[i] = numbers[lastIndex1];
            numbers[lastIndex1] = tempor;
            --lastIndex1;

        }

        System.out.println(Arrays.toString(numbers));



        

    }
}

package day32;

import javax.lang.model.SourceVersion;
import java.util.Arrays;

public class ArrayPracticeWithMethod {

    public static void main(String[] args) {

        arrayPrinter(new int[]{1,2,3,4,4,5,6,7});

        int[] scores = {5,6,7,8,9};
        arrayPrinter(scores);

        printMaxofAnArray(scores);

        int[] numbers= {12,32,56,78,43,23,56,12};
        printMaxofAnArray(numbers);

        String[] names = {"dimka","dil","murod"};
        String[] dogs = {"bulldog"};

        compare2ArraySize(names,dogs);
    }

    public static void arrayPrinter( int[] nums){
        System.out.println("this arrays has these numbers: "+ Arrays.toString(nums));
    }

    public static void printMaxofAnArray( int[]nums){
        int max=nums[0];
        int min = nums[0];
        int sum=0;
        
        for(int eachNum: nums){
            if(eachNum>max){
                max=eachNum;
            }else if(eachNum<min){
                min=eachNum;
            }
            sum+=eachNum;
        }
        System.out.println("sum = " + sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        
    }

    public static void compare2ArraySize(String[] arrOne, String[] arrTwo){
        if(arrOne.length>arrTwo.length){
            System.out.println("array One has more items than array Two");
        }else if(arrOne.length<arrTwo.length){
            System.out.println("array two has more items than array one");

        }else{
            System.out.println("they have same item count");
        }
    }
}

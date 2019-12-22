package day27;
import java.util.*;

public class GetArrayUsingScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] nums = new int[5];

        for (int i = 0; i <=4 ; i++) {
            System.out.println("Enter an in number: ");
            int input = scan.nextInt();
            nums[i]= input;
        }
        System.out.println(Arrays.toString(nums));

//        Arrays.sort(nums);
//
//        int maxNum = nums[nums.length-1];
//        System.out.println("maxNumber = " + maxNum);
            int max = nums[0];
            int min = nums[0];
            
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
                
            }if(nums[i]<min)    {
                min=nums[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}

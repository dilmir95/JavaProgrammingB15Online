package replit;

public class Task136 {

    public static void main(String[] args) {

        int[] nums = {12,5,5,5,7,8,9};
            boolean consecutive5 = false;
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==5){
                if(nums[i]==nums[i+1]){
                    consecutive5= true;
                    break;
                }
            }
        }
        System.out.println(consecutive5);
    }
}

package Tasks;

public class ArrayTask {

    public static void main(String[] args) {


        int[] nums = {17,28,30,70,77,77,};
        int average = 0;
        int sum = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;
        int min = nums[0];
        int max = nums[0];

        for (int i = 0; i <=nums.length-1 ; i++) {
            sum+= nums[i];
            if(nums[i]%2==0){
                sumOfEven+= nums[i];
            }else if(nums[i]%2==1){
                sumOfOdd+= nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }else if(nums[i]>max){
                max = nums[i];
            }
        }
        System.out.println("Average is "+ (sum/nums.length));
        System.out.println("Sum is "+ sum);
        System.out.println("Sum of even is "+ sumOfEven);
        System.out.println("Sum of odd is "+ sumOfOdd);
        System.out.println("Minimum is "+ min);
        System.out.println("Maximum is "+ max);

    }
}

package replit;

public class Task152 {

    public static void main(String[] args) {
        plus_minus(new int[]{12,12,-21,0,-11,31});

    }

    public static void plus_minus(int[] nums ){
        int posCount =0;
        int negCount =0;
        int zeroCount = 0;

        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>0){
                ++posCount;
            }else if(nums[i]<0){
                ++negCount;
            }else{
                ++zeroCount;
            }
        }
        System.out.println("positives:"+posCount+", negatives:"+negCount+", zeros:"+zeroCount);
    }
}

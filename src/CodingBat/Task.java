package CodingBat;

public class Task {

    public static void main(String[] args) {

        System.out.println(sum13(new int[]{12,13,14,15}));
    }

    public static int sum13(int[] nums) {
        int sum=0;

        for(int each: nums){
            if(each==0){
                return 0;
            }
            if(each == 13 || each==14){
                continue;
            }else{
                sum+=each;
            }
        }
        return sum;
    }

}

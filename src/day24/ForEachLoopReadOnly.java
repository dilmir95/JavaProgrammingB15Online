package day24;

public class ForEachLoopReadOnly {

    public static void main(String[] args) {

        int favNumber1 = 300;
        int favNumber2 = favNumber1;


        long[] nums ={12,40,50};

        for (int i = 0; i <=nums.length-1 ; i++) {
            long eachItem = nums[i];
            eachItem =100;
           nums[i]*=2;
            System.out.println(nums[i]);


            //never use for each loop to modify array items;
        }
    }
}

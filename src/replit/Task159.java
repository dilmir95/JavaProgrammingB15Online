package replit;

public class Task159 {

    public static void main(String[] args) {

            //printUniqueNumbers(new int[]{12,13,13,2,1,1,2,5});
        String[] words = {"dimka", "dimka","Pablo","Dima"};
        for (int i = 0; i <words.length ; i++) {
            int count =0;
            for (int j = 0; j <words.length ; j++) {
                if(words[i].equals(words[j])){
                    ++count;
                }
            }
            if(count==1){
                System.out.println(words[i]);
            }
        }
    }

    public static void printUniqueNumbers(int[] nums){

        for (int i = 0; i <nums.length ; i++) {
            int count=0;
            for (int j = 0; j <nums.length ; j++) {
                if(nums[i]==nums[j]){
                    ++count ;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }




    }
}

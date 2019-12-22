package day26;

public class ArrayTask_NumberTest {

    public static void main(String[] args) {

        int[] scores = {156,101,76,187,87,110};

        int count = 0;
        for(int eachNum : scores){
            if(eachNum>100){
                ++count;
            }
        }

        System.out.println(count);




        String finalResult = "yes";
        for (int eachScore : scores) {
            if (eachScore < 100) {
                finalResult = "no";
                break;
//            }else{
//                finalResult="yes";
//            }
            }
        }
        System.out.println("Each item is more than 100 :"+ finalResult);
    }
}

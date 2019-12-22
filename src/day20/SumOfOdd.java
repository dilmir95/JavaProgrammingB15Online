package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        int start = 10;
        int end = 100;
        int sum = 0;
        int countOfOdd = 0;
        int sumOfEven =0;
        int countOfEven=0;


        for (int i = start; i <= end ; i++) {
            if(i%2==1){
                sum = sum+i;
                countOfOdd++;

            }else if(i%2==0){
                sumOfEven+=i;
                countOfEven++;
            }


        }
        System.out.println("Sum of odd numbers is "+ sum);
        System.out.println("odd number count is: "+countOfOdd);
        System.out.println("Sum of even numbers is "+ sumOfEven);
        System.out.println("Even number count is: "+countOfEven);
    }
}

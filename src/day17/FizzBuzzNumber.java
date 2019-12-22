package day17;

public class FizzBuzzNumber {


    public static void main(String[] args) {

        //if a number can be divided by 3 and 5 fizzbuzz
        //if a number can be divided by 5 fizz
        // if a number can be divided by 3 buzz

        int num = 1;
        while(num<=100) {
            if (num % 5 == 0 && num % 3 == 0) {
                System.out.println(num + " is fizzbuzz number");
            } else if (num % 5 == 0) {
                System.out.println(num + " is a fizz number");
            } else if (num % 3 == 0) {
                System.out.println(num + " is buzz number");
            }
            ++num;
        }
//        int num2 = 1;
//        int until = 100;
//
//        while(num2<=until){
//            System.out.println(num2+" ");
//            ++num2;
        //}
    }
}

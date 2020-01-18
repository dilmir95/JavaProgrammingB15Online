package day34;

import day31.Calculator;

public class CallMethodFromAnotherClass {


    public static void main(String[] args) {


        int result1  = WarmUpTask.build3DigitNumber(5,7,9);
        //              Class name . method name();

        System.out.println(result1);

        int[] nums = {2,5,87};

        Calculator.calculate('-',20,10);
        // to view method itself click on method and click option and space


    }
}

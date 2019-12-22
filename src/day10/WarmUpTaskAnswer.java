package day10;

import jdk.swing.interop.SwingInterOpUtils;

public class WarmUpTaskAnswer {
    public static void main(String[] args) {
        String myAnswer = "";
        int myNumber = 2325;
        if(myNumber%5==0){
            myAnswer = "Fizz Number";
        }else {
            System.out.println("not a Fizz number");
        }
        System.out.println("my number is "+myNumber+", it is "+myAnswer );
    }
}

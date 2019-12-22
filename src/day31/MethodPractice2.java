package day31;

import com.sun.security.jgss.GSSUtil;

public class MethodPractice2 {

    public static void main(String[] args) {


        count1to10();
        countDownFrom20to1();
        printOddNumberFrom1to100();
        spellYourName();
    }
    public static void count1to10(){
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void printOddNumberFrom1to100(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2==1){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
    }
    public static void countDownFrom20to1(){
        for (int i = 20 ; i >=0 ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void spellYourName(){
        String name = "Dilmurod";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i)+"-");
        }
        System.out.println();
    }

}

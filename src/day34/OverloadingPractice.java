package day34;

public class OverloadingPractice {

    public static void main(String[] args) {

        add(50);
        add(20,60);
        add(535532,12131232);
        add(1,2,3);
    }

    public static void add (int num){
        System.out.println(num+100);
    }
    public static void add (int num1, int num2){
        System.out.println(num1+num2);
    }
    public static void add(int num1, int num2, int num3){

        System.out.println(num1+num2+num3);
    }
    public static void add(long num1, long  num2){
        System.out.println(num1+num2);
    }
}

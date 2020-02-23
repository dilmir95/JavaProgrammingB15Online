package CodingBat;

import java.util.ArrayList;

public class A {
    public A(){
       // System.out.println("A");
    }
    public void test(){
        System.out.println("AAAA");
    }
}
class B extends A{
    public B(){
        //System.out.println("B");
    }
    public void test(){
        System.out.println("BBBB");
    }
}
class C extends B{
    public C(){
        //System.out.println("C");
    }
    public void test(){
        System.out.println("CCCC");
    }

    public static void main(String[] args) {

        String x = null;


        StringBuilder s = new StringBuilder("java se 8");



        String s2 = "java se 8";

        System.out.println(s);

        Integer v = new Integer("1");
        System.out.println(v+4);
        switch (v){
            case 1:
                System.out.println("one" );
                break;
            case 2:
                System.out.println("one two");
                break;
        }


        int[] num1 = new int[3];
        int[] num2 = {1,2,3,4,5};
        num1=num2;
        for(int xa: num1){
            System.out.println(xa+":");
        }

    }
}



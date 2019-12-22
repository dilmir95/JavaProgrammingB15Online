package OfficeHour;

public class SwapVariableValue {

    public static void main(String[] args) {

        int a= 35, b=40;

        a= a+b; //75
        b= a-b; //75-40=35=b
        a= a-b; // 75-35=40 = a

        System.out.println("a is equal to "+ a+" b is equal to "+b);




    }
}

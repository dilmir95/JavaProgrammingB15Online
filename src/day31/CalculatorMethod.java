package day31;

public class CalculatorMethod {

    public static void main(String[] args) {

        add(12,24);
        add(34,56);
        multiply(12,2);
    }

    public static void add(int num1, int num2){

        System.out.println("Addition result: "+(num1+num2));
    }
    public static void multiply( int num1, int num2)    {
        System.out.println("Multipliciation result is:"+ (num1*num2));
    }
}

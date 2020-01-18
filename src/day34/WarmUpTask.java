package day34;

public class WarmUpTask {

    public static void main(String[] args) {


        int result1  = build3DigitNumber(5,7,9);

        int result2 = build3DigitNumber(6,4,0);

        System.out.println(build3DigitNumber(6,14,0));

        int total = result1+result2;
        System.out.println(total);

    }

    public static int build3DigitNumber (int num1, int num2, int num3){
        if(num1 <0 || num1>9){
            num1=0;
        }
        if(num2 <0 || num2>9){
            num2=0;
        }
        if(num3 <0 || num3>9){
            num3=0;
        }
        int result = (num1*100)+(num2*10)+(num3);
        return result;
    }
}

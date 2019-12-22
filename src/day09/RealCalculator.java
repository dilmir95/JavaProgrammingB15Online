package day09;
import javax.management.MBeanRegistration;
import java.util.Scanner;

public class RealCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = 100;
        int num2 = 20;
        char operator = '*';
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}

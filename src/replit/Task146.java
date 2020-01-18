package replit;

import java.util.Scanner;

public class Task146 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        plus();

    }
    public static void plus(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter second number:");

        int num2 = scan.nextInt();
        System.out.println("result:"+ (num1+num2));




    }


}

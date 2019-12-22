package replit;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task61 {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan.nextInt();
        //WRITE YOUR CODE HERE
        int d = 0;
        d= (num1>num2)?(num1<num2)? num2: num1: num2;
        System.out.println(d);


    }
}

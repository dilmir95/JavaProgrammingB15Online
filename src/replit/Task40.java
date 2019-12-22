package replit;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1==num2){
            System.out.println(num1+" and "+num2+" are equal");
        }else if(num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }else if(num2>num1){
            System.out.println(num2+" is greater than "+num1);
        }
                /*
                    U have 2 numbers already declared and assigned values.

        Using Multi-Branch if statements, check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:

        Enter 2 numbers:
        10
        10
        10 and 10 are equal

        Enter 2 numbers:
        100
        55
        100 is greater than 55
                 */
    }
}

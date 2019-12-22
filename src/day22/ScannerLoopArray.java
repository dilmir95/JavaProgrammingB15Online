package day22;

import java.util.Scanner;

public class ScannerLoopArray {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[]numbers = new int[10];
        for (int x=0; x< numbers.length; x++){
            System.out.println("Enter your number: "+(x+1));
            numbers[x]= scan.nextInt();

        }
            int sum = 0;
        for (int i = 0; i <= numbers.length-1 ; i++) {
            System.out.print( numbers[i]  +" ");
            sum+= numbers[i];

        }
        System.out.println();
        System.out.println("sum = " + sum);
    }
}

package day19;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
//
//        int end = scan.nextInt();
//        //int start = scan.nextInt();
//            int start;
//
//        for(start = scan.nextInt() ; start<=end; start++  ){
//
//            System.out.print(start+",");
//        }
        System.out.println(" enter starting speed");
        int start = scan.nextInt();
        System.out.println("Enter ending speed");
        int end = scan.nextInt();
        if (end > start) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
        } else if (start > end) {
            for (int i = start; i >= end; i--) {
                System.out.print(i + ",");
            }
        }else {
            System.out.println("No action needed same speed");
        }
    }
}

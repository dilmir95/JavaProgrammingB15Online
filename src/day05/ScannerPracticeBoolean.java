package day05;

import java.util.Scanner;

public class ScannerPracticeBoolean {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Are you recording: ");
        boolean recording = input.nextBoolean();
        System.out.println(" you are recording: "+ recording);


    }
}

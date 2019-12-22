package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task132 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        int judge = 0;
        while(judge < 7 ){
            System.out.println("Enter score for judge "+(judge+1)+":");
            score[judge]= input.nextFloat();
            ++judge;
        }
            Arrays.sort(score);

        float max = score[6];
        float min = score[0];
        float sum = score[1]+score[2]+score[3]+score[4]+score[5];



        System.out.println(Arrays.toString(score));
        System.out.println("Enter difficulty");
        float difficulty = input.nextFloat();
        float total = (sum*difficulty)*0.6f;
        System.out.println("Total: "+total);
    }
}

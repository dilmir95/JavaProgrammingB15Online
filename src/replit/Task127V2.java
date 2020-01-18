package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task127V2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int[] zero = {0,0,0,0,0,0,0,0};
        int day = 0;

        do{
            System.out.println("Day "+day+" "+ Arrays.toString(inhabitants));
            ++day;
            for (int i = 0; i <inhabitants.length ; i++) {
                inhabitants[i]= inhabitants[i]/2;


            }

        }while(!Arrays.equals(zero,inhabitants));

        System.out.println("Day "+day+" "+Arrays.toString(zero));
        System.out.println("---- EXTINCT ----");
    }
}

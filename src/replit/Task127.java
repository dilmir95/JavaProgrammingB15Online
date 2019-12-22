package replit;

import java.util.Arrays;
import java.util.Scanner;

public class Task127 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int max = inhabitants[0];
        for (int i = 0; i <inhabitants.length ; i++) {
            if(max<inhabitants[i]){
                max=inhabitants[i];

            }
        }

        int sum=0;

        for (int i = 0; i <=100 ; i++) {
            System.out.print("Day "+i+" ");
            System.out.println(Arrays.toString(inhabitants));
            sum=0;
            for (int j = 0; j <inhabitants.length ; j++) {
                inhabitants[j]= inhabitants[j]/2;
                sum+= inhabitants[j];
            }
            if(sum==0){
                System.out.print("Day "+(i+1)+" ");
                System.out.println(Arrays.toString(inhabitants));
                break;
            }
        }
        System.out.println("---- EXTINCT ----");
    }
}

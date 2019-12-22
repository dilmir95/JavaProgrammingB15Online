package replit;

import java.util.Scanner;

public class Task90 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String countSymbol = "";

        double checkTotal=0;
        System.out.println("Split:");
        String split = scan.next();
        System.out.println("Number of people:");
        int numOfPpl = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String quality = scan.next();
        if(quality.equalsIgnoreCase("poor")){
            checkTotal=checkAmount*1.05;
        }else if(quality.equalsIgnoreCase("fair")){
            checkTotal=checkAmount*1.10;
        }else if(quality.equalsIgnoreCase("good")) {
            checkTotal=checkAmount*1.15;
        }else if(quality.equalsIgnoreCase("great")) {
            checkTotal=checkAmount*1.20;
        }else if(quality.equalsIgnoreCase("excellent")) {
            checkTotal=checkAmount*1.25;
        }

            double tip = checkTotal-checkAmount;

        for (int i = 1; i <=50 ; i++) {
            countSymbol+= "&";
            if(i==numOfPpl){
                System.out.println("Number of people entered: " +countSymbol);
            }
        }

        System.out.println("Total to pay: "+checkTotal);
        System.out.println("Total tip: "+(checkTotal-checkAmount));
        System.out.println("Total per person: "+(checkTotal/numOfPpl));
        System.out.println("Tip per person: "+tip/numOfPpl);




    }
}

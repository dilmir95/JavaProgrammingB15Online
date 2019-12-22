package replit;

import java.util.Scanner;

public class Task51 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split:");

        String split = scan.nextLine();
        System.out.println("Number of people:");
        int numOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");

        String quality = scan.next();

        double total = 0;




                System.out.println("Number of people entered: " + numOfPeople);


        if(quality.equalsIgnoreCase("poor")){
            total= checkAmount*1.05;
        }else if(quality.equalsIgnoreCase("fair")) {
            total = checkAmount * 1.1;
        }else if(quality.equalsIgnoreCase("good")) {
            total = checkAmount * 1.15;
        }else if(quality.equalsIgnoreCase("Great")) {
            total = checkAmount * 1.2;
        }else if(quality.equalsIgnoreCase("excellent")) {
            total = checkAmount * 1.25;
        }
        System.out.println("Total to pay: "+ total);
        System.out.println("Total tip: " +(total-checkAmount));
        System.out.println("Total per person: "+ (total/(numOfPeople)));
        System.out.println("Tip per person: "+ ((total-checkAmount)/(numOfPeople)));




    }
}

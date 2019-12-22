package day06;
import java.util.Scanner;

public class WakeUpPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the regular price? ");
        double regularPrice = scan.nextDouble() ;
        System.out.println("What is the discount? ");
        double discount = scan.nextDouble();
        System.out.println("You got a deal for " + (regularPrice-regularPrice*discount));




    }
}

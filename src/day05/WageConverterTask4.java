package day05;
import java.util.Scanner;

public class WageConverterTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what is your hourly wage? ");
        int hourlyWage = scan.nextInt();
        System.out.println("Your annual salary based " +
                "on 2080 hours a year equals to "+ (hourlyWage*2080)+ " $ ");



       }

    }


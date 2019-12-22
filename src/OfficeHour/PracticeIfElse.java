package OfficeHour;
import java.util.Scanner;

public class PracticeIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rate your headache from 0 to 10");
        int headache = scan.nextInt();
        if (headache>=5 && headache<=10){
            System.out.println("take 2 pills of ibuprofen");
        }else if (headache>=1 && headache<5){
            System.out.println("take 1 pill of ibuprofen");
        }else System.out.println("Invalid entry");
    }
}

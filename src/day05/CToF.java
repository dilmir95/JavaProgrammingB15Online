package day05;
import java.util.Scanner;

public class CToF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the temperature in C");
        int tempC = scan.nextInt();
        System.out.println(tempC+ " c is "+ ((tempC* 9/5)+ 32)+ " F ") ;
    }
}

package day05;
import java.util.Scanner;

public class MToCm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many meters do you want to convert to centimeters?");
        double meterCount = scan.nextDouble();
        double cmCount = meterCount*100;
        System.out.println("there are "+ cmCount+" cm's in "+ meterCount+" meters");



    }
}

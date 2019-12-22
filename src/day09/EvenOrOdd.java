package day09;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        if(num%2 ==0){
            System.out.println("Even Number");
        }else
        System.out.println("Odd Number");
        System.out.println("end");
    }
}

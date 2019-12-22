package day08;
import java.util.Scanner;

public class GradingScale {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your grade for the exam?");

        int grade = scan.nextInt();
        if(grade>=90){
            System.out.println("you have recieved an A");
        }else if (grade>=80){
            System.out.println("you have revieved a B");
        }else if(grade>=70){
            System.out.println("You have recieved a C");
        }else if (grade>=60){
            System.out.println("you have recieved a D");
        }else {
            System.out.println("you have failed the exam");
        }
    }
}

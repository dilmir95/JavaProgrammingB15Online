package day11;
import java.util.Scanner;

public class ScoreChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();
        if(score<0 || score>100){
            System.out.println("Invalid Score");
        }else if (score ==100){
            System.out.println("Perfect Score");
        }else if(score>=70 && score<100){
            System.out.println("You have passed");
        }else if (score>=40 && score<70){
            System.out.println("attend additional class");
        }else {
            System.out.println("you have failed");
        }

    }

}

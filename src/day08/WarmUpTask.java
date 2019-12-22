package day08;
import java.sql.SQLOutput;
import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();
        if (age>=18){ System.out.println("You are ready to vote");}
          else if(age<0) {System.out.println("Invalid entry");}
        else System.out.println("wait until you are 18");

//        System.out.println("Please guess my favorite number");
//        int favNum = scan.nextInt();
//        int myFavNum = 7;
//        if (favNum == myFavNum){
//            System.out.println("Bingo!");}
//        else {
//            System.out.println("Try again!");}

    }
}

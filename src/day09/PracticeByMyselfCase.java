package day09;

import java.util.Scanner;

public class PracticeByMyselfCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choiceLetter = "";
        System.out.println("Please enter your test number");
        int testChoice = scan.nextInt();
        switch (testChoice){
            case 1:
                choiceLetter = "A";
                        break;
            case 2 :
                choiceLetter = "B";
                break;
            case 3:
                choiceLetter = "C";
                break;
            case 4 :
                choiceLetter = "D";
                break;
            default:
                choiceLetter = "Invalid Entry:";


        }
        System.out.println("You have selected "+choiceLetter);
    }
}

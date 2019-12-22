package day08;
import java.util.Scanner;

public class MultiBrandIfStatement {
    public static void main(String[] args) {
        //given your currentSpeed, speedLimit,
        /*  *check wheter the current speed is more than 90 = jail
        80 to 90 wreckless driving
        70 to 80 point taken
        60 to 70 warning
        else keep driving
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your current speed");

        int currentSpeed = scan.nextInt();
        if(currentSpeed>90){
            System.out.println("you are going to jail");
        }
        else if (currentSpeed>80){
            System.out.println("wreckless driving");
        }
        else if (currentSpeed>70){
            System.out.println("you are speeding and you get points taken");
        }else if (currentSpeed>60){
            System.out.println("your speed is more than 60 and less than 70");
        }
        else {
            System.out.println("keep driving");
        }
    }
}

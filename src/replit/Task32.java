package replit;
import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();
        hours = (inputSeconds/60)/60;
        minutes = (inputSeconds/60)%60;
        seconds = inputSeconds%60;

        System.out.println(hours+" hours "+minutes+" minutes, and "+seconds+ " seconds");




        /*


-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
         */
    }
}

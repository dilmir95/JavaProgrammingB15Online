package replit;
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;


        System.out.println("Enter number of milligrams in drink:");
        double milligrams = scan.nextInt();
        double overdose = (int) (10000/milligrams);
        System.out.println("It would take about "+overdose+" drinks for a lethal overdose.");

        /*
        Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
lethal overdose.

Write a program with a variable that holds the number of milli-
grams of caffeine in a drink and outputs how many drinks it takes to kill a person.

A 12-ounce can of cola has approximately 34 mg of caffeine, while a 16-ounce cup
of coffee has approximately 160 mg of caffeine.

In one gram there are 1000 mg.

Please refer to the image above as an example and use any number of variables you want.
Dots mean a space in the image.
         */
    }
}

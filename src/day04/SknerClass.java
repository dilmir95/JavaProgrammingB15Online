package day04;
import java.util.Scanner;

public class SknerClass {
    public static void main(String[] args) {
        //I want to save users input after asking some questions
        // and i want to save this input so i can do something with it
        //step 1: use scanner class to create scanner object
        //that has this functionality
        Scanner scan = new Scanner(System.in);
        //ask user to enter name
        System.out.println("Enter your first name please: ");

        //capture what user types
        String firstName = scan.next();
        //print the result what we saved from user input
        System.out.println("you have entered : "+ firstName);
        System.out.println("What is your age ? :");
        int age = scan.nextInt();
        System.out.println(" your age is : "+ age);
        System.out.println("are you married? ");
        boolean married = scan.nextBoolean();
        System.out.println("you are married "+ married);
        System.out.println("How much is banana ? ");
         double priceOfBanana = scan.nextDouble();
         System.out.println("the price of the banana in the market is "+ priceOfBanana);

        System.out.println("can you tell me the weather conditions please ");
        String theWeatherToday = scan.next();
        System.out.println(" Today the weather is "+ theWeatherToday)  ;






    }
}

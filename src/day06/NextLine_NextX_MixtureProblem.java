package day06;
import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name: ");
        String name = scan.nextLine();
        System.out.println("your name is: "+ name);

        System.out.println("What is your age: ");
        int age = scan.nextInt();
        scan.nextLine(); //so we can move on to the next step
        System.out.println("your age is: "+ age);

        System.out.println("What is your adress: ");
        String address = scan.nextLine();
        System.out.println("your address is: "+ address);


    }
}

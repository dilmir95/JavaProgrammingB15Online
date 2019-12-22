package day06;
import java.util.Scanner;

public class UsingTheValueOfOtherVariable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int myFavNum = 300;
//        int yourFavNum = myFavNum;
//
//        System.out.println("My favorite number is:"+ myFavNum);
//        System.out.println("your favorite number is:"+ yourFavNum);
//        yourFavNum = 400;
//
//        System.out.println("My favorite number is:"+ myFavNum);
//        System.out.println("your favorite number is:"+ yourFavNum);
        System.out.println("What do you want?");
        String yourOrder = scan.nextLine();
        String  myOrder = yourOrder;
        System.out.println("i want a "+ yourOrder);
        System.out.println("i also want a "+ myOrder);



    }
}

package day06;
import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class ScannerCapturingMultipleWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        System.out.println("What is your name?");
//        String name = scan.next();
//        String anotherWord = scan.next();
//        String secondWord = scan.next();
//        System.out.println("You have entered "+ name);
//        System.out.println("Another word is "+ anotherWord);
//        System.out.println("Second word is "+ secondWord);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("You have entered "+ name);

        System.out.println("Where do you live? ");
        String city = scan.nextLine();
        System.out.println("you live in : "+ city);
        System.out.println("What is your address?");
        String address = scan.nextLine();
        System.out.println("Your address is: "+ address);

    }
}

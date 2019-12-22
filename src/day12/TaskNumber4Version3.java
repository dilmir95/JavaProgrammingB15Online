package day12;

import java.util.Scanner;

public class TaskNumber4Version3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        String password = scan.next();

        boolean userNameCorrect = userName.equals("abc123");
        boolean userNameCorrect2 = userName.equalsIgnoreCase("Abc123");
        System.out.println(userNameCorrect2);

    }
}

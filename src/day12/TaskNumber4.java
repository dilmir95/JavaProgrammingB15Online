package day12;
import java.util.Scanner;

public class TaskNumber4 {

    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         String userName = scan.next();
         String password = scan.next();

         if(userName.equalsIgnoreCase("user123") && password.equals("Pass123")){
             System.out.println("Login successful");
         }if (userName.equalsIgnoreCase("USEr123")){

        }else {
            System.out.println("user name is not correct");
        }if (password.equals("Pass123")){

        }else {
            System.out.println("password is not correct");
        }
    }
}

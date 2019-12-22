package day12;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TaskNumber4Version2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        String password = scan.next();

        if(userName.equals("user123") && password.equals("pass123")) {
            System.out.println("Login successful");
        }else if(!userName.equals("user123") && password.equals("pass123")){
            System.out.println("user name not correct");
        }else if (userName.equals("user123") && !password.equals("pass123")){
            System.out.println("password nor correct");
        }else {
            System.out.println("user name and password not correct");
        }
    }
}

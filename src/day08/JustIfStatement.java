package day08;

import java.util.Scanner;

public class JustIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("what is the current spped?");
        int currentSpeed = scan.nextInt();

        System.out.println("what is the speed limit");
        int speedLimit = scan.nextInt();
        if(currentSpeed>= speedLimit){
            System.out.println("get pulled over");
          //there is no else
        }
        System.out.println("the end");
    }
}

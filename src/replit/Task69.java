package replit;

import java.util.Scanner;

public class Task69 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        int half = word.length()/2;
        String halfWord = word.substring(0,half+1) +word.substring(0,half+1) ;
        System.out.println(half);
    }
}

package replit;

import java.util.Scanner;

public class Task4StringMan {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string with at least 3 characters");

        String word = scan.next();

        if(word.length()%2 == 0){
            System.out.println(word.substring(0,1));
            System.out.println(word.charAt((word.length()/2)-1));
            System.out.println(word.charAt((word.length())-1));

        }else{
            System.out.println(word.substring(0,1));
            System.out.println(word.charAt((word.length()/2)));
            System.out.println(word.charAt((word.length())-1));
        }
    }
}

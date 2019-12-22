package replit;

import java.util.Scanner;

public class Task67 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int x = word.length()-1;
            if(word.length()==5){
                while(x>=0){
                    System.out.print(word.charAt(x));
                    --x;

                }
            }else if(word.length()<5){
                System.out.println("Too short!");
            }else if(word.length()>5){
                System.out.println("Too long!");
            }
        /*
                Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

        Example:
        input: cat
        output: Too short!

        Example:
        input: singularity
        output: Too long!

        Example:
        input: apple
        output: elppa
         */
    }
}

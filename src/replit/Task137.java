package replit;

import java.util.Scanner;

public class Task137 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] eachWord = sentence.split(" ");

        for (int i = eachWord.length-1; i >=0 ; i--) {
            System.out.println(eachWord[i]);
        }
    }
}

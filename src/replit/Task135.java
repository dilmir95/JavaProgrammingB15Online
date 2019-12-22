package replit;

import java.util.*;

public class Task135 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] eachWord = sentence.split(" ");
        for (int i = 0; i <eachWord.length ; i++) {
            System.out.println(eachWord[i]);
        }
    }
}

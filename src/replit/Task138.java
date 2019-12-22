package replit;

import java.util.*;

public class Task138 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed = "";

        String[] eachWord = sentence.split(" ");
            String reversed1 = "";

        for (int i = eachWord.length-1; i >=0 ; i--) {
            reversed1+= eachWord[i]+ " ";
        }
        reversed= reversed1.substring(0,reversed1.length()-1);
        System.out.println(reversed);
    }
}

package replit;

import java.util.Scanner;

public class Task73 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int middle = word.length()/2;

        if(word.length()>=5 && word.length()%2 == 1){
            System.out.println(word.substring(middle-1, middle+2));
        }else{
            System.out.println("invalid");
        }
        /*
                        You have a word, do the following:

        If the word has odd number of characters
        and has 5 or more characters, print the middle three
        characters of the word.

        Otherwise print "invalid".
         */
    }
}

package replit;

import java.util.Scanner;

public class Task79 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.contains("x") || word.contains("X")){
          String word1=  word.replace("x", "").replace("X", "");
            System.out.println(word1);
        }else{
            System.out.println(word);
        }
    }
}

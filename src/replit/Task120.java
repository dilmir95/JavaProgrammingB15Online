package replit;

import java.util.Scanner;

public class Task120 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        int max = words[0].length();
        String longest = words[0];

        for(String wordsss: words){
            if(wordsss.length()>max){
                longest=wordsss;
            }
        }
        System.out.println(longest);
    }
}

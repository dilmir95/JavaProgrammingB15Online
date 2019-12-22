package day16;

import java.util.Scanner;

public class SecondWordGetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = scan.nextLine();
        String secondWord;

        secondWord = sentence.substring(( sentence.indexOf(" ")+1)  , sentence.lastIndexOf(" ")         );

        System.out.println(secondWord);

        String lastWord = sentence.substring(sentence.lastIndexOf(" ")+1);
        System.out.println(lastWord);

        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        System.out.println(firstWord);

    }
}

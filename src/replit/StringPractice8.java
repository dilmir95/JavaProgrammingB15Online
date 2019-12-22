package replit;

import java.util.Scanner;

public class StringPractice8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence");

        String sen = scan.nextLine();

        sen = sen.trim();
        if(sen.indexOf(" ") == sen.lastIndexOf(" ")){
            System.out.println("you have entered two words");
        }else {
            System.out.println("you have entered more than 2 words");
        }




    }
}

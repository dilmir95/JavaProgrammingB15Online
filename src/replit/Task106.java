package replit;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Task106 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        String check = "";

        for (int i = 0; i <=word.length()-1 ; i++) {
            check = word.charAt(i)+"";
            if(check.equals("a") || check.equals("e")|| check.equals("o")|| check.equals("u")|| check.equals("i")){

                System.out.print(check);
            }

            //System.out.print(word.charAt(i));

        }
    }
}

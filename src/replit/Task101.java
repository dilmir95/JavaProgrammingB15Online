package replit;

import java.util.Scanner;

public class Task101 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countOfJava = 0;
        int countOfPython = 0;
        String java = "";
        String python = "";


        for (int i = 0; i <= sentence.length()-4 ; i++) {
            java = sentence.substring(i,i+4);
            if(java.equals("java")){
                ++countOfJava;
            }
        }
        for (int x = 0; x <=sentence.length()-6 ; x++) {
            python=sentence.substring(x,x+6);
            if(python.equals("python")){
                ++countOfPython;
            }
        }
        if(countOfJava==countOfPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

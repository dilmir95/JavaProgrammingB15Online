package replit;

import java.util.Scanner;

public class Task93 {

    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String java = "";

//        if(word.substring(0,5).contains("java")){
//            System.out.println("true");
//        }else if(word.length()<4){
//            System.out.println(exists);
//        }else{
//            System.out.println(exists);
//        }

        for (int i = 0; i <= word.length()-1 ; i++) {
            java= java+word.charAt(i);




        }if(word.length()<4){
            System.out.println("false");
        } else if(java.substring(0,5).contains("java")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}

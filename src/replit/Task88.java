package replit;

import java.util.Scanner;

public class Task88 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
            int lastCharIndex = word.length()-1;

        for (int i = 0; i <= lastCharIndex-2 ; i++) {
            String move = word.substring(i, i+3);
            if(move.equalsIgnoreCase("cat")){
                ++countOfCats;
            }else if (move.equalsIgnoreCase("dog")){
                ++countOfDogs;
            }
        }
        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}

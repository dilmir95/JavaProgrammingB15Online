package replit;

import java.util.Scanner;

public class Task64_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int middle = word.length()/2;

        if(word.length()>=3 && (word.length()%2)==1){
            System.out.println(word.charAt((word.length()-1)/2));
        }else if(word.length()==1){
            System.out.println(word+word+word);
        }
        if(word.length()%2 ==0 && word.length()>=4){
            System.out.println(word.substring(middle-1, middle+1));
        }else if(word.length()==2){
            System.out.println(word+word);
        }
    }
}

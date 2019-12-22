package day09;
import java.util.Scanner;

public class LanguagePicker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String greeting = "";
        int optionNumber = scan.nextInt();
        if(optionNumber==1){
            greeting = "Hello";
        }else if (optionNumber==2){
            greeting = "Salam";
        }else if (optionNumber==3){
            greeting= "Hola";
        }else if(optionNumber==4){
            greeting = "Privet";
        }else if (optionNumber==5){
            greeting = "Merhaba";
        }else if (optionNumber==6) {
            greeting = "Bonjour";
        }else {
            greeting = "Invalid Entry";
        }

        System.out.println(greeting+" SDET");
    }
}

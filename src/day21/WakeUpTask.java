package day21;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myName = scan.nextLine();
        String concat = "";

        for (int i = 0; i <= myName.length()-1 ; i++) {
            concat = myName.substring(i,i+1);
            concat += "->";
            //concat= concat+myName.charAt(i)+ "->";
            System.out.print(concat);
        }
        //System.out.println(concat);
        System.out.println();
        for (int i = 0; i <=myName.length()-2 ; i++) {
            concat= myName.substring(i,i+2);
            System.out.print(concat+"->");
        }
    }
}

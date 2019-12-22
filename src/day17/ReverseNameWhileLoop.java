package day17;

import java.util.Scanner;

public class ReverseNameWhileLoop {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int until = 0;

        String name = scan.nextLine();
        int lengthName = name.length()-1;
        while(lengthName>=until){

            System.out.print(name.charAt(lengthName));
            --lengthName;
        }
    }
}

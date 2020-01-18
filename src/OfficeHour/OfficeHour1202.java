package OfficeHour;

import java.util.Scanner;

public class OfficeHour1202 {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
        String item = "Eco Dot (3rd Gen) Charcoal";

        int indexOfOpeningPar = item.indexOf("(");
        int indexOfClosingPar = item.indexOf(")");

        String generation = item.substring(indexOfOpeningPar+1, indexOfClosingPar);
        System.out.println("generation = " + generation);



        String letters = "J&*(%av*a";
        System.out.println(letters);
        letters=letters.replace("&", "")
                .replace("*", "")
                .replace("%", "")
                .replace("(", "")
                .toUpperCase();
        System.out.println(letters);
    }
}

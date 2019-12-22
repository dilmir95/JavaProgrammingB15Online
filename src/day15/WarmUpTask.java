package day15;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();
        int namelengths = name.length();

        if(namelengths<=4){
            System.out.println("short name");
        }else if(namelengths>=5  && namelengths<=10 ){
            System.out.println("medium name");
        }else if(namelengths>=11){
            System.out.println("long name");
        }else{
            System.out.println("invalid name");
        }


        if(name.contains("a") || name.contains("e")){
            System.out.println("name contains a or e ");
        }else{
            System.out.println("i dont have both a or e in my name");
        }




    }
}

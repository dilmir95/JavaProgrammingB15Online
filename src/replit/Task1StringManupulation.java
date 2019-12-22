package replit;

import java.util.Scanner;

public class Task1StringManupulation {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String anything = scan.next();

        if(anything.length()>1){
            System.out.println(anything.charAt(0) +""+ anything.charAt(1));
        }else if(anything.isEmpty()){
            System.out.println(anything.charAt(0)+""+anything.charAt(0) );


        }else{
            System.out.println("it is empty");
        }

        String cava = "dilmurod";

        if(cava.length()>2){
            System.out.println(cava.substring(0,2));
        }



    }
}

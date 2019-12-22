package day14;

import org.w3c.dom.ls.LSOutput;

public class StringReview {
    public static void main(String[] args) {


        String str = "i like pumpkin";
        System.out.println(str.equals("pumpkin"));

        //contains:
        System.out.println(str.contains("pumpkin" ));
        boolean gotPumpkin = str.contains("pumpkin");
        
        //shortcut to print variable value in nice format soutv +tab
        
        System.out.println("gotPumpkin = " + gotPumpkin);

        System.out.println(str.startsWith("i like"));
        System.out.println(str.endsWith("kin"));
    }
}
package replit;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;

public class Task180 {

    public static void main(String[] args) {


        String target = "dilmurod";
        String word = "dil";
        int x = word.length();
        System.out.println(target.substring(0,3)+word+target.substring((3)));

        System.out.println(coverString("dilmurod","dil"));
        System.out.println(coverString("apple","apple"));
        System.out.println(coverString("dilmurod dilmurod dilmurod","dil"));



    }

    public static String coverString(String main, String coverME){
        String result="";
        if(main.contains(coverME)){
            result = main.replace(coverME, "["+coverME+"]");
        }

        return result;
    }
}

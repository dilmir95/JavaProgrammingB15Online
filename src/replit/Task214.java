package replit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task214 {

    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>(Arrays.asList("dimurod","dil","dimla","dimir"));

        String find = "dil";
        String result="";
        for(String each: r){
            if(each.contains(find)){
                result= each;
            }
        }
        System.out.println(result);
    }
}

package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("dimka","Shoxsanam"));
        List<String> list2 = new ArrayList<>(Arrays.asList("lima","bob"));


        List<String> list3 = new ArrayList<>(list1);
        System.out.println(list3);
        list1.addAll(list2);


    }
}

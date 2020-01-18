package OfficeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice0109 {

    public static void main(String[] args) {

        String[] students = {"Dilmurod","Kamran", "Karima","Esra"};

        List<String> list1 = new ArrayList<>(Arrays.asList(students));


        List<String> added= Arrays.asList("Shoxsanam","dimka");

        list1.addAll(added);

        System.out.println(list1);

        list1.removeAll(Arrays.asList("dimka","Karima"));

        System.out.println(list1);

        

    }
}

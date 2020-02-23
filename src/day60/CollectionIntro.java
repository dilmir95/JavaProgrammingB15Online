package day60;

import day38.ArrayListShortWay;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionIntro {

    public static void main(String[] args) {

        Collection<String> lst = new ArrayList<>();
        lst.add("Dilmurod");
        lst.add("Bob")  ;
        lst.add("Abdu");

        lst.addAll(lst);
        System.out.println(lst);

        lst.addAll(Arrays.asList("Shoxsanam","Nazar"));
        System.out.println(lst);

        lst.removeAll(Arrays.asList("Bob"));
        System.out.println(lst);

        lst.forEach(each -> System.out.println(each));
        //lambda expression to print each element in collection




    }
}

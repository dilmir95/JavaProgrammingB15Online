package day36;

import java.util.*;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<String> lst1 = new ArrayList<>();


        ArrayList<Integer> list2 = new ArrayList<>();

        lst1.add("Dilmurod");
        lst1.add("Dimka");
        lst1.add("Dilmir");
        System.out.println(lst1);

        List<Double> list4 = new ArrayList<>();

        list2.add(45);
        list2.add(67);
        list2.add(100);

        System.out.println(list2);

        list2.set(0,99);
        list2.set(1,100);
        list2.set(2,101);
        System.out.println(list2);

        System.out.println(list2.contains(15));

        String name = "Dilmurod";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();

        ArrayList<Float> list7 = new ArrayList<>();
        list7.add(77.1f);
        list7.add(12.6f);
        System.out.println(list7);
    }
}

package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItem {

    public static void main(String[] args) {

        List<Integer> lst2 = new ArrayList<>();

        lst2.add(2);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);


        lst2.remove(3);
        System.out.println(lst2);

        lst2.remove(Integer.valueOf(2));
        System.out.println(lst2);

        lst2.remove(Integer.valueOf(1123));



    }
}

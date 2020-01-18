package day36;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Long> lst1 = new ArrayList<>();
        // add item, read item, update item, remove item, check the location, insert an item

        lst1.add(300l);
        lst1.add(100l);     //adding item to array list
        lst1.add(20l);
        lst1.add(500l);
        System.out.println(lst1);

        System.out.println(lst1.size());  //to get the size of array list

        System.out.println(lst1.get(0)); //return a value at an index

        Long sum = 0l;
            long max = lst1.get(0);
            
        for (int i = 0; i <lst1.size() ; i++) {
            sum+= lst1.get(i);
            if(max<lst1.get(i)){
                max=lst1.get(i);
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);

        lst1.add(2,125l);
        System.out.println(lst1);

        lst1.set(3,195l);
        System.out.println(lst1);

        lst1.remove(100l);
        System.out.println(lst1);

        lst1.remove(1);

        System.out.println(lst1.indexOf(500l));

        System.out.println(lst1.isEmpty());

        lst1.clear();
        System.out.println(lst1);
    }
}

package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkOperation {

    public static void main(String[] args) {

        List<String> groceries = Arrays.asList("Eggs", "Milk", "Butter", "Apple", "Salmon");


        ArrayList<String> addGroceries = new ArrayList<>(groceries);


        addGroceries.add("diet coke");
        addGroceries.add("sugar");

        System.out.println(addGroceries);


        List<String> newItemsToAdd = Arrays.asList("Pasta", "spinach", "banana");

        addGroceries.addAll(newItemsToAdd);

        System.out.println(addGroceries);

        List<Integer> list5 = Arrays.asList(12,12,45,67,87,65);

        List<Integer> list6 = new ArrayList<>(list5);

        List<Integer> listAdd = Arrays.asList(77,99);

        //to add multiple items in one shot
        list6.addAll(Arrays.asList(100,200,300,400));


        System.out.println(list6);

        list6.addAll(listAdd);

        System.out.println(list6);

    }
}


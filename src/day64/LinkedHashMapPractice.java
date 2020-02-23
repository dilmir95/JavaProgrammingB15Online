package day64;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class LinkedHashMapPractice {

    public static void main(String[] args) {


        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);

        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        System.out.println(groceryPriceMap);


        //Linked hashmap and linked hashset just keep the insertion order



    }
}

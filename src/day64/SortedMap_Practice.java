package day64;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class SortedMap_Practice {

    public static void main(String[] args) {


        SortedMap<String, Double> groceryPriceMap = new TreeMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);

        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        System.out.println(groceryPriceMap);

        //intervieew question
        //difference between HashMap and HashSet
        //Hashset is implementation of Set interface and Hashmap is implementation of Map interface
        //completely different data structure
        /*
        Hashmap no insertion order no sorted order
        LinkedHashMap insertion order no sorted order
        TreeMap no insertion order , have sorted order

         */






    }
}

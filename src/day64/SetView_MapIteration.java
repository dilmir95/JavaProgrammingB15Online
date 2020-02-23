package day64;

import java.util.HashMap;
import java.util.*;

public class SetView_MapIteration {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);

        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        Set<String> allKeys = groceryPriceMap.keySet();


        for(String eachKey: allKeys){
            System.out.println(groceryPriceMap.get(eachKey));
        }
    }
}

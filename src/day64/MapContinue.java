package day64;

import java.util.*;

public class MapContinue {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);

        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        //Map view:
        //ketSet view, values view, entrySet view

        Set<String> allNames= groceryPriceMap.keySet();

        System.out.println(allNames);

        //allNames.remove("Tomato");
        System.out.println("allNames = " + allNames);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

        //ketSet is still connected to map whatever we do with it it reflects to Map
        System.out.println("-=================================");
        Set<String> allNames1 = new HashSet<>(groceryPriceMap.keySet());
        allNames1.remove("Tomato");
        System.out.println(allNames1);







    }
}

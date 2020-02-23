package day63;

import java.util.*;

public class GroceryMap {

    public static void main(String[] args) {

        Map<String, Double> groceryMap = new HashMap<>();
        groceryMap.put("Apple",3.99);
        groceryMap.put("Banana",0.99);
        groceryMap.put("Meat",5d);
        groceryMap.put("Kiwi",2.99);
        groceryMap.put("Milk",3.49);
        groceryMap.put("Cereal",6d);


        groceryMap.putIfAbsent("Meat",50d);
        System.out.println(groceryMap);

        System.out.println(groceryMap.get("Meat"));
        //groceryMap.replace("Apple",3.99,(3.99*2));
        groceryMap.replace("Apple",groceryMap.get("Apple")*2);

        //groceryMap.replace("Cereal",6d,(6d*2));
        groceryMap.replace("Cereal",groceryMap.get("Cereal")-2);


        System.out.println(groceryMap);

        if(groceryMap.containsKey("Banana")){
            groceryMap.remove("Banana");
        }

        System.out.println(groceryMap);

    }
}

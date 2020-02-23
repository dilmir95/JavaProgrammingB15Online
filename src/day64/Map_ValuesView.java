package day64;

import java.util.*;

public class Map_ValuesView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);

        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);


        Collection<Double> allValues = groceryPriceMap.values();

        System.out.println(allValues);

        allValues.remove(1.99);
        System.out.println("groceryPriceMap = " + groceryPriceMap);

//        Iterator<Double> valueIter = allValues.iterator();
//
//        while(valueIter.hasNext()){
//            if(valueIter.next()>3){
//                valueIter.remove();
//            }
//        }
//        System.out.println(groceryPriceMap);
        allValues.removeIf(each -> each>3);
        System.out.println(groceryPriceMap);



        List<Double> lstValues = new ArrayList<>(allValues);


    }
}

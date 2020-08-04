package day64;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IteratingWithLambda {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);

        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

       // groceryPriceMap.forEach((name,price)-> System.out.println("name = " + name+" price "+price));
groceryPriceMap.forEach((key,value)-> System.out.println(key+" "+value));


        Map<Integer,String> job_idAndName = new HashMap<>();
        job_idAndName.put(707,"Dimka Yakubov");
        job_idAndName.put(701,"John Doe");
        job_idAndName.put(702,"Arya Stark");


        job_idAndName.forEach((id,name)-> {
            System.out.println(id+" "+name);
            if(id==701){
                System.out.println("Found employee 701");
            }
        });

    }
}

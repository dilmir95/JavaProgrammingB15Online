package day64;

import java.util.HashMap;
import java.util.*;

public class Practice_ {
    public static void main(String[] args) {

        Map<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Dilmurod", 24);
        nameAge.put("Bob", 26);
        nameAge.put("Shoxsanam", 28);
        nameAge.put("Islom", 22);

        System.out.println(nameAge.get("Islom"));
        System.out.println(nameAge);

        Set<String> allNames = nameAge.keySet();
        allNames.remove("Islom");
        System.out.println(nameAge);

        Collection<Integer> allAges = nameAge.values();

        for(Map.Entry<String, Integer> each: nameAge.entrySet()){
            System.out.println(each);
        }






    }








}

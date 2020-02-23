package day64;

import java.util.*;

public class Map_Practice$ {

    public static void main(String[] args) {

        Map<String, List<String>> groupMap  = new HashMap<>();
        List<String> names = new ArrayList<>();
        names.add(" Karima Jarylgapova");
        names.add("Marina Kan");
        names.add("Yeliz Akbas");
        names.add("Dilmurod Yakubov");

        groupMap.put("Lone Star",names);
        groupMap.put("BugHunters",Arrays.asList("Furkan","Daria","Serife","Muge"));
        System.out.println(groupMap);

        System.out.println(groupMap.get("Lone Star").get(3));


        System.out.println(groupMap.get("BugHunters").contains("Muge"));

        groupMap.get("Lone Star").add("Bobur");
        System.out.println(names);

        //key for the map should be immutable because of hashCode



    }
}

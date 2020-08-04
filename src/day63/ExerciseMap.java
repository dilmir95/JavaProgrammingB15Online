package day63;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ExerciseMap {

    public static void main(String[] args) {

        List<String> groupLst = new ArrayList<>(Arrays.asList("Kamran","Serdar","Esra","Karima","Khayyam","Muhammer",
                "Dilmurod","Mussie","Yeliz"));

        Map<String, Integer> nameAndCharCountPair = new HashMap<>();
        for(String eachName : groupLst){
            nameAndCharCountPair.put(eachName, eachName.length());
        }

        System.out.println(nameAndCharCountPair);
        


    }
}

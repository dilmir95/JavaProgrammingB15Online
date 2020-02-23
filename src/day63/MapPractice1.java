package day63;

import day49.Chargable;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class MapPractice1 {

    public static void main(String[] args) throws IOException {
        List<String> readingSocialFile = Files.readAllLines(Paths.get("src/day63/social.txt"));
        Map<Long,String> socialNamePair = new HashMap<>();
        for(String each: readingSocialFile){
           // System.out.println(each);

            socialNamePair.put(Long.parseLong(each.split(",")[0]),each.split(",")[1]);

        }
        System.out.println(socialNamePair);


        String str = "AAABBBFFFFERRRRRSSSSSS";

        Map<String,Integer> freqCount = new HashMap<>();
        String[] chars = str.split("");
        for (String each: chars){
            if(!freqCount.containsKey(each)){
                freqCount.put(each,1);
            }else{
                freqCount.replace(each, (freqCount.get(each)+1));


            }
        }
        System.out.println(freqCount);
    }
}

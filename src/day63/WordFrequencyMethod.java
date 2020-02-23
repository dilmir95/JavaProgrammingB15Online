package day63;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyMethod {

    public static void main(String[] args) {

        System.out.println(getFreqMap("java java java java java is fun"));

    }

    public static Map<String, Integer> getFreqMap (String x) {
        Map<String, Integer> mapStr = new HashMap<>();

        for (String each : x.split(" ")) {
            if (mapStr.containsKey(each) == false) {
                mapStr.put(each, 1);
            } else {
                mapStr.replace(each, mapStr.get(each) + 1);
            }
        }

        return  mapStr;
    }
}

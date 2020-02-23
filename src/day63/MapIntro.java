package day63;

import java.util.*;

public class MapIntro {

    public static void main(String[] args) {

        Map<String , String> nameAndStatePair = new HashMap<>();

        Map<Integer, String> groupNumAndLeaderName = new HashMap<>();
            //key,   value
        //first type is key and then comes value



        Map<String ,Integer> nameAndAgePair = new HashMap<>();
        //.put to add elements
        nameAndAgePair.put("Dilmurod",24);
        nameAndAgePair.put("Shoxsanam",28);
        nameAndAgePair.put("Bobur",24);
        nameAndAgePair.put("Nazar",25);
        nameAndAgePair.put("Kamran",29);
        //nameAndAgePair.put("Dilmurod",26);



        System.out.println(nameAndAgePair);

        System.out.println(nameAndAgePair.get("Dilmurod"));

        System.out.println(nameAndAgePair.containsKey("Bobur"));

        nameAndAgePair.putIfAbsent("Dilmurod",29);

        nameAndAgePair.replace("Shoxsanam",22);
        System.out.println(nameAndAgePair);

        nameAndAgePair.replace("Dilmurod",24,80);
        // only replace if the value is 24 else it wont replace

        System.out.println(nameAndAgePair);

        nameAndAgePair.remove("Dilmurod");
        System.out.println(nameAndAgePair);

        System.out.println(nameAndAgePair.containsKey("Kamran"));


    }
}

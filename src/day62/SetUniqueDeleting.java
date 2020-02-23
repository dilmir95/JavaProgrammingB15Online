package day62;

import java.util.*;
import java.util.HashSet;

public class SetUniqueDeleting {

    public static void main(String[] args) {

        Set<String> states = new HashSet<>(Arrays.asList("GA","NY","TX","FL","TX","GA","AZ"));

        states.remove("GA");
        System.out.println(states);

        Iterator<String> stIter = states.iterator();

//        while(stIter.hasNext()){
//            String result = stIter.next();
//            if(result.contains("A")){
//                stIter.remove();
//            }
//        }
//        System.out.println(states);
        

        states.removeIf(each -> each.contains("A"));
        System.out.println("states = " + states);

    }
}

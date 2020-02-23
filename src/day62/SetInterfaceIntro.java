package day62;

import java.util.*;

public class SetInterfaceIntro {

    public static void main(String[] args) {

        Set<Integer>  myNum = new HashSet<>();
        myNum.add(10);
        myNum.add(10);
        myNum.add(12);
        myNum.add(13);
        myNum.add(76);
        myNum.add(30);
        myNum.add(30);
        myNum.add(24);

        System.out.println(myNum);

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);
        Set<Integer> myNum2 = new HashSet<>(numList);
        System.out.println("myNum2 set list = " + myNum2);

        Set<Integer> myNum3 = new HashSet<>(Arrays.asList(20,20,40,40,55,55,41));
        System.out.println("myNum3 set list = " + myNum3);


        System.out.println("===================================");
        Set<String> states = new HashSet<>();
        states.add("Texas");
        states.add("Florida");
        states.add("Colorado");
                states.add("Texas");
                states.add("Florida");
                
                Iterator<String> nameIter = states.iterator();
                
                while (nameIter.hasNext()){
                    System.out.println("nameIter.next() = " + nameIter.next());
                }
        System.out.println("=============================");
                for (String each: states){
                    System.out.print(each+" ");
                }

        System.out.println("============================");
        System.out.println(states.size());
        System.out.println("lambda below ====================");
        states.forEach(each -> System.out.println(each));

    }
}

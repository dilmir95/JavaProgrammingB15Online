package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {

    public static void main(String[] args) {

        SortedSet<Integer> myNums = new TreeSet<>();
        
        myNums.add(10);
        myNums.add(90);
        myNums.add(20);
        myNums.add(12);
        myNums.add(42);
        myNums.add(53);
        myNums.add(1);
        myNums.add(90);
        System.out.println("myNums = " + myNums);
        System.out.println(myNums.first());
        System.out.println(myNums.last());




    }
}

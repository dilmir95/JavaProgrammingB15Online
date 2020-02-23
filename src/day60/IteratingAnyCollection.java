package day60;

import java.util.*;

public class IteratingAnyCollection {

    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10,32,31,12,54,2));
        System.out.println(nums.removeAll(Arrays.asList(10,11,12)));
        System.out.println(nums);
        System.out.println("==================================");
        Iterator<Integer> myIter =  nums.iterator();

        /// hasNext()   check if have next item
        //next()    will move pointer to next item

//        myIter.hasNext();
//        System.out.println(myIter.next());
        while(myIter.hasNext()){
            //System.out.println(myIter.next());
            if(myIter.next()<10){
                myIter.remove();
            }
        }

        System.out.println(nums);

        Collection<String> names = new ArrayList<>(Arrays.asList("Dimka","Dilmurod","Dil","Dima"));

        Iterator<String> myIter2 = names.iterator();

        while (myIter2.hasNext()){
            System.out.println(myIter2.next());
        }
    }
}

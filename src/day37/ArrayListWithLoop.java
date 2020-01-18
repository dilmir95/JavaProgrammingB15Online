package day37;

import day18.ForLoopIntro;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithLoop {

    public static void main(String[] args) {

        /*
        Array list of integer and fill it up with 1 to 100
         */

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <=100 ; i++) {
            nums.add(i);
            
        }

        System.out.println("nums = " + nums);

        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)%2==1){
                nums.set(i, 0);
            }
        }
        System.out.println(nums);

        nums.add(0,100);
        System.out.println(nums.indexOf(20));


        List<Integer> lst2 = new ArrayList<>();

        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);

        lst2.add(lst2.indexOf(34)+1, 100);

        System.out.println(lst2);

        for (int i = 0; i <5 ; i++) {
            lst2.add(0,100);
        }

        System.out.println(lst2);
    }
}

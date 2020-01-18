package replit;
import java.lang.reflect.Array;
import java.util.*;
public class Task201 {

    public static void main(String[] args) {

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(10,20,30));

        System.out.println(appendPosSum(list5));

    }

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){

        ArrayList<Integer> list1  = new ArrayList<>();
        Integer sum = 0;
        for(Integer each: nums){
            if(each>0){
                sum+=each;
                list1.add(Integer.valueOf(each));
            }
        }
        list1.add(Integer.valueOf(sum));
        return list1;
    }
}

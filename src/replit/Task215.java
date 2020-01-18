package replit;
import java.lang.reflect.Array;
import java.util.*;
public class Task215 {

    public static void main(String[] args) {
        ArrayList<Integer> list1  = new ArrayList<>(Arrays.asList(12,15,45,50));

        System.out.println(twoTimes(list1));

        System.out.println(twoTimess(list1));
    }
    public static ArrayList<Integer> twoTimes (ArrayList<Integer> x){
        ArrayList<Integer> y = new ArrayList<>();
        int index = 0;
        int sizeOfNew= x.size()*2;
        System.out.println(sizeOfNew);
        for (int i = 0; i <sizeOfNew ; i+=2) {
            y.add(i,x.get(index));
            y.add(i,x.get(index));
            ++index;
        }
        return y;
    }

    public static ArrayList<Integer> twoTimess(ArrayList<Integer> list){
        ArrayList<Integer> why=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            why.add(list.get(i));
            why.add(list.get(i));
        }
//        for (int i = 0; i <list.size() ; i+=2) {
//            list.add(i,list.get(i));
//        }
        return why;
    }
}

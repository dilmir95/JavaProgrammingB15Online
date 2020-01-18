package day37;

import java.util.ArrayList;

public class MethodWithArrayListReturnType {

    public static void main(String[] args) {

        System.out.println(oneToXArray(25));


    }

    /**
     * This method will return a list of Integer that containing numbers
     * starting from 1 till finalNumber
     * @param finalNumber this is the last item of the list
     * @return List</Integer> that contains 1 till final numbers increased by 1;
     */
    public static ArrayList<Integer> oneToXArray (int finalNumber){
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <=finalNumber ; i++) {
            list1.add(i);
        }
        return list1;
    }
}

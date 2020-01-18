package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllMethodPractice {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(12,13,45,67,87,65);

        List<Integer> list2 = new ArrayList<>(list1);

        list2.removeAll(Arrays.asList(12,400));

        System.out.println(list2);
    }
}

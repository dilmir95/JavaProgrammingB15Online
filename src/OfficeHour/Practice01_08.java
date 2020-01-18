package OfficeHour;
import java.util.*;
public class Practice01_08 {

    public static void main(String[] args) {

        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(12);
        numbers.add(7);

        for (int i = 1; i <numbers.size() ; i+=2) {
            numbers.add(i, 100);
        }

        System.out.println(numbers);
    }
}

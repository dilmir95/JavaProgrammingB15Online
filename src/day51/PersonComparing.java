package day51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonComparing {


    public static void main(String[] args) {

        Person p1 = new Person("Dilmurod",24);
        Person p2 = new Person("Shoxsanam",28);
        Person p3 = new Person("Bobur",24);
//        if(p1.age>p2.age){
//            System.out.println("1");
//        }else if(p1.age==p2.age){
//            System.out.println("0");
//        }else{
//            System.out.println("-1");
//        }

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));

        List<Person> list1 = new ArrayList<>(Arrays.asList(p1,p2,p3));

        Collections.sort(list1);
        System.out.println(list1);





    }
}

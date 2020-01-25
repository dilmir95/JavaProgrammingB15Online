package day43;

import day41.Person;

import java.util.*;
import java.util.Arrays;

public class PetStore {

    public static void main(String[] args) {

        Pet p1 = new Pet();
        System.out.println("p1 = " + p1);

        p1.setName("cow");
        p1.speak();



        Pet p2 = new Pet("horse","Walter");
        Pet p3 = new Pet("cat","Samantha");
        Pet p4 = new Pet("dog","Oliver");
        Pet p5 = new Pet("dog","Henry");
        Pet p6 = new Pet("cow","Adam");
        Pet p7 = new Pet("ant","Atom");
        Pet p8 = new Pet("bear","Teddy");
        Pet p9 = new Pet("cat","Stephanie");

        List<Pet> list1 = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9);

        System.out.println(list1);

        for(Pet each: list1){
            System.out.println(each.getName());
        }





    }
}

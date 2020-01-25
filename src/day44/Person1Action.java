package day44;

import day41.Person;

public class Person1Action {

    public static void main(String[] args) {

        Person1 x1 = new Person1("Arya", 18)    ;

        Person1 x2 = new Person1("Dilmurod",24);

        x1.species = "Human";
        System.out.println(x1);
        System.out.println(x2);
    }
}

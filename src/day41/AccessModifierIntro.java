package day41;

import day40.BankAccount;

public class AccessModifierIntro {


    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        //3 types of access modifier
        // public is accessible anywhere
        // (defaul) nothing - accessible only within the same package
        // private is accessible only within the same class
        Person p1 = new Person();

//        p1.name = "Dilmurod";
//        p1.age = 19;
//        p1.ssn = 123456789l;

        p1.setAll("Dilmurod", 24, 21322212121l);

        System.out.println(p1);

        p1.setAge(50);

        int emmasAge = p1.getAge();


    }
}

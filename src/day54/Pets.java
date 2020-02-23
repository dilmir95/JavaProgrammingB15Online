package day54;

import java.util.jar.Manifest;

public class Pets {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        Animal a1 = new Dog();
        IndoorPet i1 = new Dog();
        ((Animal)i1).speak();
        Object o1 = a1;
        ((Animal) o1).speak();
    }
}

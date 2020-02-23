package day49;

import replit.EducationalInstitutes;

public class Burger implements Edible , Juicy{

    @Override
    public void eat() {
        System.out.println("eating burger");
    }

    @Override
    public void drink() {
        System.out.println("drinking soda after burger");
    }

    @Override
    public void melting() {
        System.out.println("Burger is  melting and it is Juicy");
    }

    @Override
    public void digest() {
        System.out.println("burger is digesting");
    }
}

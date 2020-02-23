package day51.polymorphysm;

public abstract class Animal {

    public abstract void makeNoise();



}
class Dog extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("WOOF WOOF");
    }
}
class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meow meow");
    }
}
class Horse extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("NEihhhttt");
    }
}

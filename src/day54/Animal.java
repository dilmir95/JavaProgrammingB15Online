package day54;

public abstract class Animal {

    public abstract void speak();
}

class Dog extends Animal implements IndoorPet{

    @Override
    public void speak() {
        System.out.println("WOOF WOOF");
    }

    @Override
    public void play() {
        System.out.println("Running after the ball");
    }

}

class Cat extends Animal implements IndoorPet{
    @Override
    public void speak() {
        System.out.println("MEOW");
    }

    @Override
    public void play() {
        System.out.println(" Cat Being lazy don't wanna play ");
    }
}

package day55;

public class Dog extends Animal{

    String name;

    public Dog(String name,String type) {
        super(type);
        this.name = name;
    }

    public void bark(){
        System.out.println("WOOF , dog is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

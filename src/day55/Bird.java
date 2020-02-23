package day55;

public class Bird extends Animal{

    public Bird(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                '}';
    }
}

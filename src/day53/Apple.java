package day53;

import jdk.swing.interop.SwingInterOpUtils;

public class Apple extends Fruit {
        String type;
    public Apple(String taste, String color,String type) {
        super(taste, color);
        this.type = type;
    }

    @Override
    public void getDigested(){
        System.out.println(type+" apple is gets digested");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

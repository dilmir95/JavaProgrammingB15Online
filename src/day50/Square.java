package day50;

import java.util.logging.SocketHandler;

public class Square extends Shape {

    int length ;

    public Square(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public void calculateArea() {
        this.area = length*length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+COLOR+" square");
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}


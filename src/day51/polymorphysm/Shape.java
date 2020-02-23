package day51.polymorphysm;

public abstract class Shape {

    public abstract void draw();

}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("drawing triangle");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}

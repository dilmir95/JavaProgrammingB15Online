package day47;

public abstract class Shape {

    String name;
    double area;

    public Shape(String name){
        this.name = name;


    }
    public abstract double calculateArea();

}

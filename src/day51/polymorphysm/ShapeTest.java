package day51.polymorphysm;

public class ShapeTest {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();
        Shape s4 = new Rectangle();
        Shape s5 = new Circle();


        Shape[] shapeArray = {s1,s2,s3,s4,s5};

        for(Shape each: shapeArray){
            each.draw();

        }
    }
}

package day50;

public class ShapePoly {
    public static void main(String[] args) {


        Shape s1 = new Rectangle("rectangle 1 ",20,30);
        Shape s2 = new Square("square 1 ", 30);
        Square s3 = new Square("square 2 ", 10);

        System.out.println(s3.getClass().getSimpleName());

        printAnyShapeArea(s1);
        drawShape3times(s3);

    }
    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.area);

    }
    public static void drawShape3times(Shape s1 ){
        s1.draw();
        s1.draw();
        s1.draw();
    }
}

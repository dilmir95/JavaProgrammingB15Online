package OfficeHour;

public class Circle {

    double radius;



    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public boolean equals(Object x){
        Circle c1 = (Circle) x;

        return this.radius== ((Circle) x).radius;

    }


    public static void main(String[] args) {

        Circle c1 = new Circle(20);
        Circle c2 = new Circle(20);
        Circle c3 = new Circle(40);

        System.out.println("c1.equals(c2) = " + c1.equals(c2));
        System.out.println("c1.equals(c3) = " + c1.equals(c3));



    }
}

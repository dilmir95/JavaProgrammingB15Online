package day44.sub;

import day44.Vehicle;

public class Car extends Vehicle{

    int mileage;

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.mileage = 343232;
        c1.setYear(2019);
        c1.make = "Toyota Corolla";

        System.out.println(c1);

    }
}

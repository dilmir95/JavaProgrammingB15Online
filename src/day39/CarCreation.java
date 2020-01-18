package day39;

public class CarCreation {


    public static void main(String[] args) {

        Car car1 = new Car();

        car1.color = "Black";
        car1.make = "Mercedes";
        car1.model = "G63";
        car1.year = 2018;

        Car car2 = new Car();
        car2.year = 2019;
        car2.model = "GT";
        car2.make = "Bentley";
        car2.color = "White";



        car2.color= car1.color;

        System.out.println(car2.color);



        car2.goForward();
        car1.goForward();
        car2.ageOfCar();
        car1.ageOfCar();

    }
}

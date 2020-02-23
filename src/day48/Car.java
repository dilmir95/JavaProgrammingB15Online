package day48;

public class Car implements Drivable{

    String model;
    String make;
    int year;

    public Car(String model, String make, int year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    @Override
    public void driving() {
        System.out.println(make+" "+model+" is driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }

}

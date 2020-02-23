package day49;

public abstract class Vehicle{


    String brand;

    public abstract void start();

    public void goForward(){
        System.out.println(brand + "Vehicle is going forward");
    }

    public Vehicle(String brand) {
        this.brand = brand;
    }
}

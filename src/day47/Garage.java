package day47;

public class Garage extends ElectricCar{

    public static void main(String[] args) {

        ElectricCar tesla = new ElectricCar();
        tesla.start();
        tesla.setBatteryLevel(95);
        System.out.println(tesla.getBatteryLevel());
        tesla.goBackward();



        GasCar mercedes  = new GasCar();
        mercedes.setFuelLevel(15);
        mercedes.start();
        mercedes.goBackward();


    }
}

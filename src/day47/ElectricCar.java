package day47;

public class ElectricCar extends Car {


    int batteryLevel;


    @Override
    public void start() {
        System.out.println("Electric car starting");
    }
    @Override
    public void goBackward(){
        System.out.println("Electric car is going backward");
    }
    @Override
    public void goForward(){
        System.out.println("Electric car is going forward");
    }
    @Override
    public void turn(){
        System.out.println("Electric car is turning");
    }
    public int getBatteryLevel(){
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel){
        this.batteryLevel = batteryLevel;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }
}

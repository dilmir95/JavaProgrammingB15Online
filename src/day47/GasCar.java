package day47;

public class GasCar extends  Car{

    int fuelLevel;

    @Override
    public void start() {
        System.out.println("Gas car is starting");
    }

    @Override
    public void goForward(){
        System.out.println("Gas car is going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Gas car is going backward");
    }

    @Override
    public void turn() {
        System.out.println("Gas car is turning");
    }
    public void setFuelLevel(int fuelLevel){
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "GasCar{" +
                "fuelLevel=" + fuelLevel +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }

}

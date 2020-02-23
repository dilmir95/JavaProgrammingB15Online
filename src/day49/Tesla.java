package day49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tesla extends Vehicle implements Autonomous, Chargable {


    int horsePower;
    String model;
    int battaryLevel;

    public Tesla(String brand, int horsePower, String model, int battaryLevel) {
        super(brand);
        this.horsePower = horsePower;
        this.model = model;
        this.battaryLevel =  battaryLevel;
    }

    @Override
    public void start() {
        System.out.println("Tesla is starting");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla has a self drive functionality");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging and when it is full charge level will be: "+ MAX_CHARGED);
    }

    @Override
    public void showBattaeryLevel() {
        System.out.println(brand+" "+model+" has a battary of "+battaryLevel);
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", battaryLevel=" + battaryLevel +
                ", brand='" + brand + '\'' +
                '}';
    }


    @Override
    public void selfPark(){
        System.out.println("Tesla "+model+" can do self parking");
    }

    @Override
    public void goForward(){
        super.goForward();
        System.out.println("Tesla goes forward very fast");
    }


    public static void main(String[] args) {

        Tesla t1 = new Tesla("Tesla",300, "X",90);
        Tesla t2 = new Tesla("Tesla",400, "Roadster",54);
        Tesla t3 = new Tesla("Tesla",450, "CyberTruck",100);

        List<Tesla> list1 = Arrays.asList(t1,t2,t3);

        for(Tesla each: list1){
            if(each.horsePower>400){
                System.out.println(each);
            }
        }
    }
}

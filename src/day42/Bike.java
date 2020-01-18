package day42;

public class Bike {

    String brand;
    int speed;
    int gear;


    public Bike(){
        System.out.println("Message from constructor ");
      gear = 1;

    }
    public Bike(int gear){
        this.gear = gear;

    }
    public Bike (int speed, int gear, String brand){
        this.brand = brand;
        this.gear = gear;
        this.speed = speed;

    }
}

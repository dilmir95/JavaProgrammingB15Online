package day42;

public class BikeAction {

    public static void main(String[] args) {

        Bike b1 = new Bike();
        Bike b2 = new Bike();

        System.out.println(b1.gear);

        Bike b3 = new Bike(2);

        Bike b4 = new Bike(100, 2, "Yamaha");

    }
}

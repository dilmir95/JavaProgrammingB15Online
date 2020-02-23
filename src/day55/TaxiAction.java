package day55;

public class TaxiAction {

    public static void main(String[] args) {

        Taxi t1 = new Taxi(707, new Engine("Cummins",450),
                new Driver("Jack",12344));

        Engine e1 = new Engine("V8",460);
        Driver d1 = new Driver("dilly dilly",1214);

        Taxi t2 = new Taxi(677, e1,d1);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t2.drv.name.charAt(0));

    }
}

package day45;

public class Phone extends Electronics{

    double screenSize;
    double price;


    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.screenSize = 12;
        p1.price = 3.99;
        p1.brand = "Apple";

        Electronics.useElectricity = true;


    }
}

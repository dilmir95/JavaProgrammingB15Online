package day12;
import java.util.Scanner;

public class CarShopping {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String carBrand = "Corolla";
        int budget = 40000;
        int carPrice = 30000;
        if(carBrand.equalsIgnoreCase("corolla") || carBrand.equals("Tesla") && budget>=carPrice){
            System.out.println("Car buy");
        }else{
            System.out.println("not my car");


        }
    }
}

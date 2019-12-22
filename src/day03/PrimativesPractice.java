package day03;

public class PrimativesPractice {
    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("the letter count is "+ letterCount );

        short sheepCount = 300;
        System.out.println("Sheep count in my farm is "+ sheepCount );

        int catCount = 20;
        System.out.println("There are "+ catCount + " cats in my house");

        long mileToSun = 12132423l;
        long mileToMoon = 500000000L;
        // floating point number

        System.out.println("Miles to Sun is"+ mileToSun);


        float priceOfBanana = 1.99f;    //you must add the "f" at the end of number to indicate that it is float
        // upper case or lower case does not matter, but it is mandatory
        System.out.println("price of the banana in krogers is "+ priceOfBanana);


        float priceOfPotato = 2.49f;

        // bigger floating point numbers
        double priceOfIpad = 355.99d;
        double priceOfIpadPro = 1024.99D;
        double priceOfMac = 2400.99;

        System.out.println("the price of the ipad pro at apple store is "+ priceOfIpadPro + " and the price of mac is "+ priceOfMac);
        //if you have a whole number by itself, compiler automatically assume it is an int
        // if you have a fractional number the compiler thinks it is a double


    }
}

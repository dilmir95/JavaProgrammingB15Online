package day04;

public class Temperatures {
    public static void main(String[] args) {
        double ferenheit = 78;
        double celsius;
        celsius = (5.0/9)* (ferenheit -32);
        System.out.println(ferenheit+ " f equal to "+ celsius+ " C");

        double houstonF = 38.0d;
        double celcius = (5.0/9)* (houstonF-32);
        System.out.println("the temperature in houston is "+ houstonF+ " F which is equal to "+ celcius+ " C");

        double tashkentF = 22.0d;
        double cel = (5.0/9)* (tashkentF-32);
        System.out.println("the temperature is tashkent is "+ tashkentF+ " F which is equal to "+ cel +" C ");



    }
}

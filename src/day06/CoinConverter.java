package day06;

public class CoinConverter {
    public static void main(String[] args) {

        //you have 2 dollars and break it to dimes
        int cents = 200;
        cents -= 74;
        int quarter = cents/25;
        int remainingCent = cents%25;

        System.out.println("Your change is "+ quarter+" quarters and "+remainingCent+"cent");
        int dimes = cents/10;
        int remainingPenny = cents%10;

        System.out.println("Your change is "+ dimes+" dimes and "+remainingPenny+"cent");


    }
}

package day05;

public class VariablePractice {
    public static void main(String[] args) {

        int birthYear = 1995;
        int currentYear = 2019;

        System.out.println("I was born in "+ birthYear+ " and I am "+ (currentYear - birthYear));
        ///task number 2

        int speedLimit = 75;
        int yourSpeed = 85;
        int overTheLimit = (yourSpeed - speedLimit);

        System.out.println("You are driving "+ yourSpeed + " MPH, The speed limit is "+speedLimit+
                " and your going "+ overTheLimit +" over the speed  limit. you will get a ticket today.");



    }
}

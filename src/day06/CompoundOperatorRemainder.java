package day06;

public class CompoundOperatorRemainder {
    public static void main(String[] args) {
        int bankBalance = 1140;
        System.out.println("i have spent half:"+ bankBalance);
        bankBalance /= 2;
        System.out.println("now my balance is"+ bankBalance);
        bankBalance %= 500;
        System.out.println("the remainder is "+ bankBalance);

    }
}

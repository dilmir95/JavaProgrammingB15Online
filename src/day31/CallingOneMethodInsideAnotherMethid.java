package day31;

public class CallingOneMethodInsideAnotherMethid {


    public static void wakeUp(){
        System.out.println("Open your eyes, only one");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm? open it again");

    }
    public static void drinkCoffee(){
        System.out.println("Make your coffee with coffee machine");
        System.out.println("Drink your coffee");
    }
    public static void finallyAwake(){

        wakeUp();
        drinkCoffee();
    }
    public static void main(String[] args) {

        finallyAwake();
        drinkCoffee();

    }
}

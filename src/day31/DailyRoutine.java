package day31;

public class DailyRoutine {

    public static void wakeUp(){
        System.out.println("Open your eyes, only one");
        System.out.println("Close your eyes");
        System.out.println("Hear your alarm? open it again");

    }
    public static void drinkCoffee(){
        System.out.println("Make your coffee with coffee machine");
        System.out.println("Drink your coffee");
    }
    public static void goToWork(){
        System.out.println("Prepare and put on your work clothes");
        System.out.println("get in your car and start driving to work");

    }
    public static void studyJava(){
        System.out.println("Open your computer");
        System.out.println("log in to canvas and intellij");
        System.out.println("Start coding until you fall asleep");
    }
    public static void sayILoveJava300Times(){
        for (int i = 1; i <=300 ; i++) {
            System.out.print("I love java | ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            wakeUp();
        System.out.println("==================");
        drinkCoffee();
        System.out.println("==================");
        goToWork();
        System.out.println("===================");
        studyJava();
        System.out.println("=====================");
        sayILoveJava300Times();
        /*
        wake up
        shower
        have breakfast
        go to work
        grocery shopping
        cooking
        study java
        go to sleep

         */
    }

}

package day40;

public class SpaceShipGame {

    public static void main(String[] args) {

        SpaceShip s1 = new SpaceShip();

        s1.setDirection("up");
        s1.setInitialPosition(12,12);
        s1.name = "Dimka";

        System.out.println(s1);

        s1.move1Block();
        System.out.println(s1);


        s1.move1Block("left");
        System.out.println(s1);
    }


}

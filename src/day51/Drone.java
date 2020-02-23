package day51;

public class Drone implements UprightFlyable {

    @Override
    public void flyUpright() {
        System.out.println("Fly upright");
    }

    @Override
    public void fly() {
        System.out.println("fly regular");
    }
}

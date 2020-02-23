package day48;

public class BounceAction {

    public static void main(String[] args) {

        Ball b1 = new Ball("Round","Brown");

        b1.bounce();
        System.out.println(Ball.GRAVITY+" gravity pulling it to the Earth");


        Bouncible b2 = new Ball("Oval","Yellow");

        b2.bounce();
        System.out.println(b2);
    }
}

package day49;

public interface Autonomous {

    void selfDrive();


    default void selfPark(){
        System.out.println("Self parks itself");
    }
}

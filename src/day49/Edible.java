package day49;

public interface Edible {

     boolean IS_HUMAN_FOOD = true;

    void eat();
    void drink();

    default void digest(){
        System.out.println("you implement the code yourself");

        //only cause of deault is to not break the code of other classes that is implementing this interface
    }


}

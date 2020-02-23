package replit;

public class DogStore {

    public static void main(String[] args) {

        Dog d1 = new Dog("Dil",2,"Shephard");
        Dog d2 = new Dog("Dil",2,"Shephard");
        Dog d3 = new Dog("Dil",2,"Shephard");
        Dog d4 = new Dog("Dil",2,"Shephard");

        System.out.println(d1.equals(d2));

        System.out.println(d1.getAgeInHumanYears());

        System.out.println(d1);
    }
}

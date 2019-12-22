package day24;

public class GroceryTaskArray {

    public static void main(String[] args) {

        String[] groceryItems = {"Apple", "Banana", "Grape","Strawberry", "Blueberry", "Kiwi"};

        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f} ;

        for(String eachFruit   :  groceryItems  ){
            System.out.print(eachFruit);
            if( !eachFruit.equals(groceryItems[groceryItems.length-1])) {
                System.out.print("->");

            }
        }
    }
}

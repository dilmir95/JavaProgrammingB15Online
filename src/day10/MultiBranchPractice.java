package day10;
import java.util.Scanner;

public class MultiBranchPractice {
    public static void main(String[] args) {

        System.out.println("Welcome to McDonalds, what can i get for you"   );
        Scanner scan = new Scanner(System.in);
        int itemNumber = scan.nextInt();
        String order = "";
        if(itemNumber==11){
            System.out.println("you have selected 11");
            order = "Burger";
        }else if(itemNumber==5  ){
            System.out.println("you have selected 5");
            order = "French Fry";
        }else if(itemNumber==8){
            System.out.println("you have selected 8");
            order = "Nuggets";

        }else if(itemNumber==35){
            System.out.println("you have selected 35");
            order = "Ice Cream";
        }else{
            System.out.println("This item is not on the menu");
            order= "Unknown";

        }
        System.out.println("your order is "+ order);
    }
}

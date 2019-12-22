package day10;
import java.util.Scanner;

public class MultiBranchSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to McDonalds, what can i get for you"   );
        int itemNumber = scan.nextInt();
        String order = "";
        switch (itemNumber){
            case 11:
                System.out.println("you have selected 11");
                order = "Burger";
                break;
            case 5:
                System.out.println("you have selected 5");
                order = "French Fry";
                break;
            case 8:
                System.out.println("you have selected 8");
                order = "Nuggets";
                break;
            case 35:
                System.out.println("you have selected 35");
                order = "Ice Cream";
                break;
            default:
                System.out.println("This item is not on the menu");
                order= "Unknown";
        }


        System.out.println("your order is "+ order);



    }

}

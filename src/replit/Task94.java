package replit;

import java.util.Scanner;

public class Task94 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalProce = 0;

        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            System.out.println("Add one more item?");
            countinue= scan.next();

            shoppingListReport=shoppingListReport+ "Item"+count+": "+item+" Price: "+price+", ";
            ++count;
            totalProce+= price;


        }while(countinue.equalsIgnoreCase("yes"));
        System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-2));
        System.out.println("Total price: "+totalProce);

    }
}

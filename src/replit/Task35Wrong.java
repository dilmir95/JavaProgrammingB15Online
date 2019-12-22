package replit;
import java.util.Scanner;

public class Task35Wrong {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int smartphone = 300;
        double        laptop = 400;
        double     charger=15;
        double    usbCable=10;
        double    headphones=30;
        double    pants=50;
        double   hat=25;
        double   socks=5;
        double   blanket=60;
        double   pillow=40;
        System.out.println("Please enter item");
        String item = scan.nextLine();


        if(item.equals("Smartphone") && smartphone<100 ) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - smartphone) + "$");

        }else if(item.equals("Laptop") && laptop<100 ) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (100 - laptop) + "$");

        }else if(item.equals("Charger") && charger<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-charger)+"$");

        }else if(item.equals("USB cable") && usbCable<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-usbCable)+"$");

        }else if(item.equals("Headphones") && headphones<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-headphones)+"$");

        }else if(item.equals("Pants") && pants<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-pants)+"$");

        }else if(item.equals("Hat") && hat<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-hat)+"$");

        }else if(item.equals("Socks") && socks<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-socks)+"$");

        }else if(item.equals("Blanket") && blanket<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-blanket)+"$");

        }else if(item.equals("Pillow") && pillow<100 ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: "+(100-pillow)+"$");
        }


                /*
        Hint
        Use if/ else if / else
        CODE EXAMPLE:
        Example #1
        input: Hat
        output: Thank you for your purchase!
        output: Your current balance is: 75$

        Example #2
        input: Pants
        output: Thank you for your purchase!
        output: Your current balance is: 50$

        Example #3
        input: Laptop
        output: Sorry, not enough funds on your gift card!

        Example #4
        input: Cupcake
        output: Invalid item!
        List of items
                 */
    }
}

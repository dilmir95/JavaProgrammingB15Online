package day13;
import java.util.Scanner;

public class WarmUpTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to go shopping? enter true if yes , and false if no");
        boolean wantShopping = scan.nextBoolean();

        if(wantShopping==true){
            System.out.println("do you want to go to a store or shop online?");
            String shopOnline = scan.next();
            if(shopOnline.equalsIgnoreCase("store")){
                System.out.println("go to store");
            }else if(shopOnline.equalsIgnoreCase("online")){
                System.out.println("go to amazon.com");
            }else{
                System.out.println("invalid entry");
            }
        }else {
            System.out.println("good job , stay home coding");
        }
    }
}

package day10;
import java.util.Scanner;

public class SeasonAction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" hey, what is the season?");
        String season = scan.next();
        switch(season){
            case "Springr":
                System.out.println("Nawruz");
                break;
            case "Fall":
                System.out.println("Halloween, Thanksgiving");
                break;
            case "Summer":
                System.out.println("go to the beach");
                break;
            case "Winter":
                System.out.println("Snowboarding");
                break;
            default:
                System.out.println("No such season");

        }
    }
}

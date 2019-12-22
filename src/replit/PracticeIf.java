package replit;
import java.util.Scanner;

public class PracticeIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in)   ;

        int priceOfNewIphone = scan.nextInt();
       // priceOfNewIphone *=3;
       // priceOfNewIphone /= 2;
        //priceOfNewIphone ++;
       // ++priceOfNewIphone;
        //System.out.println(priceOfNewIphone);
        if(priceOfNewIphone>800){ System.out.println("Oh it is too expensive");}
        else {System.out.println("Oh ok we can afford it");}



    }
}

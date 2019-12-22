package day11;
import java.util.Scanner;

public class StringEquality {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       // String name = scan.next();
        String name = "Rabia";  //String literal
        System.out.println(name );
        String name1 = new String("Rabia");
        System.out.println(name1);
        String name2 = "Rabia";
        System.out.println(name2);


        System.out.println(name == name1);  //false
        System.out.println(name.equals(name1)); //true / confirmed
        System.out.println(name==name2);

        System.out.println(name1.equals(name2));



    }
}

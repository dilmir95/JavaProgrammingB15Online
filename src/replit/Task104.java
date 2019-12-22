package replit;

import java.util.Scanner;

public class Task104 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String json = scan.nextLine();
        int fn = json.indexOf("firstName");
        int fnComma = json.indexOf(",", fn);
        int ln = json.indexOf("lastName");
        int lnComma = json.indexOf(",", ln);



        String firstName = json.substring(fn+13,fnComma-1);
        String lastName = json.substring(ln+12, lnComma-1);

        System.out.println("First name: "+ firstName);
       System.out.println("Last name: "+ lastName);

    }
}

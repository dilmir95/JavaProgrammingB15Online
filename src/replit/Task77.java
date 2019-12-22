package replit;

import java.util.Scanner;

public class Task77 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf("_"));

        String capFirstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String capLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);


        System.out.println("First name:"+ capFirstName);
        System.out.println("Last name:"+ capLastName);
        System.out.println("Domain:"+ email.substring(email.indexOf("@")+1, email.indexOf(".")));
        System.out.println("Top-Level Domain:"+ email.substring(email.indexOf(".")+1));

    }
}

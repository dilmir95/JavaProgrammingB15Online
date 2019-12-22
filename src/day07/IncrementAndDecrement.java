package day07;

import java.util.Scanner;


public class IncrementAndDecrement {
    public static void main(String[] args) {
//        int apple  =10;
//        apple = apple + 1;
//        apple +=1;
//        ++ apple;
//        -- apple;
//        System.out.println(apple);
//        apple *=100;
//        System.out.println(apple);
//        System.out.println(++apple);
//        System.out.println("use ++ to increment and concatinate:"+ ++apple);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name, last name, company seperated by space");
        String firstName, lastName, company, email;
        firstName = scan.next(); //("Dilmurod");
        lastName = scan.next(); //("Yakubov");
        company = scan.next();//("Verizon");
        email = (firstName+"_"+lastName+"@"+company+".com");
        System.out.println("My name is "+lastName+", "+firstName+" and I work for "+ company+" and my email is: "
        + email);



    }
}

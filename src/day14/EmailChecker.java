package day14;

public class EmailChecker {

    public static void main(String[] args) {

        String email = "dilmir95@gmail.com";

        boolean containAt = !email.contains("@");
        boolean space = email.contains(" ");
         boolean endsWith = email.endsWith("@gmail.com");

         if(containAt || space){
             System.out.println("invalid email");
         }else if(endsWith){
             System.out.println("it is a gmail");
         }else if ( email.endsWith("@yahoo.com")){
             System.out.println("it is a yahoo email");
         }else if (email.endsWith("@mail.ru")){
             System.out.println(" it is a russian email");
         }else {
             System.out.println("no such email recognized");
         }

    }
}

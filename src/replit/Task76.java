package replit;

import java.util.Scanner;

public class Task76 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");
        int indexOfAfter_ = indexOf_+1;
        int indexOfAfterAt = indexOfAt+1;

        if(email.contains("_")){
            String email1=  email.substring(indexOfAfter_, indexOfAt) + "_"+ email.substring(0,indexOf_)
                    + email.substring(indexOfAt);
            System.out.println(email1);
        }else{
            System.out.println(email);
        }
    }
}

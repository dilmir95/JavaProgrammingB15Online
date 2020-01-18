package replit;

import java.util.Scanner;

public class Task148 {

    public static void cube()
    {
        //your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num*num*num);
    }//end cube

    public static void main(String[] args) {

        cube();

    }

}
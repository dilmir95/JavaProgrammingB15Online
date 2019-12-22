package replit;

public class Task91 {

    public static void main(String[] args) {

        /*
        Write a loop that displays all possible combinations of two letters where the letters are 'z',
        or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:
         */

//            char less;
//            char oneLess = 'z'-1;
//            String alphabet = "";
//
//        for (char i = 'z'; i >= 'v' ; i--) {
//
//            System.out.println(i);
//            System.out.println(i);
//            System.out.println(i);
//            System.out.println(i);
//            System.out.println(i);
//        }
//        char letter1 = 'z';
//
//        char letter2 = 'v';

        for (char i = 'z'; i >= 'v'; i--) {
            for (char j = 'z'; j >= 'v'; j--) {
                System.out.println("" + i + j);
            }
        }
    }
}
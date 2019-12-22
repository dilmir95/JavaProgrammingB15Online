package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args) {


        //given a string with even number char count
        // print 2 chars in one line
        //for example: Dilmurod result; di lm ur od

        String name = "Dilmurod";

        int charCount = name.length();

//
//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.substring(4,6));
//        System.out.println(name.substring(6,8));

        //int x = 0;
//        System.out.println(name.substring(x, x+2));
//        x+=2;
//        System.out.println(name.substring(x, x+2));
//        x+=2;
//        System.out.println(name.substring(x, x+2));
//        x+=2;
//        System.out.println(name.substring(x, x+2));
//        x+=2;

        for (int x = 0; x <= name.length()-2; x+=2) {
            System.out.println(name.substring(x, x+2));
        }
    }
}

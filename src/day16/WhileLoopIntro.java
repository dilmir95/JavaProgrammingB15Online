package day16;

public class WhileLoopIntro {

    public static void main(String[] args) {

        String hello = "Hello World";
         int x =0;
         while(x<7){
             System.out.println(hello);
             ++x;
         }


         int count = 1;
         while (count <=5){
             System.out.println("coding");
             System.out.println("count = " + count);
             ++count;

             /*
             1st time in loop count =1
             check if 1 if less than or equal to 5
             if true print "coding"
             add 1 to the count
             2 nd loop count = 2
             check if 2 is less than 5 or equal to 5
             if true print "coding"
             add 1 to the count
             3rd loop count =3
             check if 3 is less than or equal to 5
             if true print "coding"
             add 1 to the count

              */
         }
    }
}

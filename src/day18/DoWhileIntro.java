package day18;

public class DoWhileIntro {


    public static void main(String[] args) {

        //count from 1 to 5;
        int x =1;
        do{
            System.out.println(x);

            ++x;
        }while(x<=5 ); //semicolon after while boolean is mandatory
         int y = 5;
        do{
            System.out.println(y);
            --y;
        }while(y>=1);

    }
}

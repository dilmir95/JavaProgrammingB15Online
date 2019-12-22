package day07;

import java.sql.SQLOutput;

public class PreIncrementandPostIncrement {
    public static void main(String[] args) {

        int apple = 8;
        apple++;
        System.out.println(apple);
        System.out.println(++ apple);
        System.out.println(apple++  ); //it will increase value but next time it show up
        System.out.println(apple);

        int score = 50;
        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);
        System.out.println(--score);
        System.out.println(score--);

    }
}

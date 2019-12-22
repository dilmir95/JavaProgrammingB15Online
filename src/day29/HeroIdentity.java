package day29;

import java.sql.SQLOutput;

public class HeroIdentity {

    public static void main(String[] args) {

        String hero1 = "Supermamn-Clark J Kent";

        String[] heroSplit = hero1.split("-");

        String hero = heroSplit[0];
        String star ="";
        for (int i = 0; i <heroSplit[1].length() ; i++) {
            star+= "*";
        }

//        System.out.println("hero = " + hero);
//        System.out.println("star = " + star);

        String heroX = hero+"-"+star;
        System.out.println(heroX);
    }
}

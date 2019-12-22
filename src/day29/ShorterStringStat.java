package day29;

public class ShorterStringStat {

    public static void main(String[] args) {

        String hero = "Superman- Clark J kent";

        String[] heroSplit = hero.split("-");
        String fullName = heroSplit[1];
            String heroId = heroSplit[0];
        String heroX = heroId+"-";

        for (int i = 0; i <fullName.length() ; i++) {
            heroX+= "*";
        }
        System.out.println(heroX);
    }
}

package day26;

import java.util.Arrays;

public class CountItemInAnArray {

    public static void main(String[] args) {

        String[] marvelHeroes = {"Iron Man", "Captain America", "Spiderman"
                , "Black Panther", "Hulk", "Black Widow", "Wanda", "Captain Marvel","Iron Man",
        "Hulk", "Black Panther"};

        System.out.println(Arrays.toString(marvelHeroes));

        String itemToSearch = "Iron Man";
        int countOfItem=0;
        int countOfBlack = 0;
        for (String marvelHero : marvelHeroes) {
            if(itemToSearch.equals(marvelHero)){
                ++countOfItem;
            }if(marvelHero.toLowerCase().contains("black")){
               ++countOfBlack; 
            }
        }
        System.out.println("countOfItem = " + countOfItem);
        System.out.println("countOfBlack = " + countOfBlack);
    }
}

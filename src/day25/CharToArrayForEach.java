package day25;

import java.util.Arrays;

public class CharToArrayForEach {

    public static void main(String[] args) {

        String name = "Yakubov";

        char[] lastName = new char[name.length()];
        int aCOunt = 0;
        for (int i = 0; i <= lastName.length-1 ; i++) {
            lastName[i]= name.charAt(i);
            if(lastName[i]=='a'){
                ++aCOunt;
            }
//            System.out.println(lastName[i]);
        }
        System.out.println("lastName = " + Arrays.toString(lastName));
        System.out.println("a count is : " +aCOunt);

        char[] nameChar = name.toCharArray();
        System.out.println(Arrays.toString(nameChar));

        for(char eachChar: nameChar) {
            System.out.println("EachChar = " + eachChar);
        }


        String car = "Ford Motors";
        char[] carChar = car.toCharArray();
        System.out.println(Arrays.toString(carChar));

        String movie = "Narcos";
        char[] chars = movie.toCharArray();


       for(char eachChar : chars){
           System.out.println("each char: "+ eachChar);
       }

    }
}

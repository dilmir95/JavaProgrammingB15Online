package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args) {


        // Arrays class is coming from java.util package
        //it has lots of pre built method to work with array object
        String[] superHeroes = {"Superman","Batman","Wonder Woman", "Aquaman","Flash"};


        //for printing the content of array; Arrays.toString(yourArray)
        System.out.println(Arrays.toString(superHeroes));
        String  savingSuperHeroes = Arrays.toString(superHeroes);
        System.out.println(savingSuperHeroes.charAt(0));

        int[] numbers = {10,40,50,32,56};
        System.out.println(Arrays.toString(numbers));

        double[] prices = {12.4,545.3,3232.5};
        String pricesString = Arrays.toString(prices);
        for (int i = 0; i <=pricesString.length()-1 ; i++) {
            System.out.println("at index"+i+ " i have char "+ pricesString.charAt(i));


        }


        //for sorting arrays in ascending order Arrays.sort(yourArray);


        //for checking equality of 2 array objects content
        // Array.equals(firstArray, secondArray)


    }
}

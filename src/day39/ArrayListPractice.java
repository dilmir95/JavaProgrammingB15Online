package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> productList = new ArrayList<>(Arrays.asList
                ("iPhone 6s,449,18.71",
                        "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16",
                        "MacbookPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68",
                        "Beats HeadPhones,349.99,15.12",
                        "Mous,79.99,8.98",
                        "Charger,39.99,4.56",
                        "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25",
                        "TV,2199,89.49",
                        "Apple Watch,559,21.18"));
            ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthly = new ArrayList<>();

        for (int i = 0; i <productList.size() ; i++) {
            String[] splitted = productList.get(i).split(",");
            itemNames.add(i, splitted[0]);
            prices.add(i, Double.valueOf(splitted[1]));
            monthly.add(i, Double.valueOf(splitted[2]));
        }


        System.out.println(itemNames);
        System.out.println(prices);
        System.out.println(monthly);
    }
}

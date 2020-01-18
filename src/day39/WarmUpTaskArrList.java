package day39;
import java.util.*;
public class WarmUpTaskArrList {


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


        System.out.println(productList.size());
            double sum = 0;
        for (int i = 0; i <productList.size() ; i++) {
          String[] productSplit=  productList.get(i).split(",");
          String productName = productSplit[0];

            System.out.println(productName);
            double price = Double.parseDouble(productSplit[1]);
            if(price>500){
                System.out.println(price);

            }
            
            sum+= price;
            
        }

        double avgValue = sum/productList.size();
        System.out.println("avgValue = " + avgValue);
            double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
        String result = "";
        for (int i = 0; i <productList.size() ; i++) {

            if(maxPrice<Double.parseDouble(productList.get(i).split(",")[1])){
                maxPrice=Double.parseDouble(productList.get(i).split(",")[1]);

               result= productList.get(i) ;
            }

        }
        System.out.println("maxPrice = " + maxPrice);
        System.out.println(result);


        for (int i = 0; i <productList.size() ; i++) {
            if(productList.get(i).contains("Dyson")){

                String[] splitted = productList.get(i).split(",");

                double price = Double.parseDouble(splitted[1]);
                double newPrice = price*0.2;

                System.out.println(splitted[0]+(newPrice+"")+splitted[2]);
            }
        }


    }
}

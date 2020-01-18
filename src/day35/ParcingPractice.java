package day35;

public class ParcingPractice {

    public static void main(String[] args) {

        String sentence = "I bought 3 tomato and the price was 3,14 each";

        String[] eachWord = sentence.split(" ");
       String priceOf =  eachWord[eachWord.length-2].replace(",",".");


        int count = Integer.parseInt(eachWord[2]);

        float price = Float.parseFloat(priceOf);

        float total = count*price;

        System.out.println(total);

        System.out.println("====================== One Shot");


    }
}

package day37;

import java.util.ArrayList;

public class WarmUpTaskList {

    public static void main(String[] args) {

        ArrayList<String> lst = new ArrayList<>();

        lst.add("Karima");
        lst.add("Kamran");
        lst.add("Serdar");
        lst.add("Yeliz");
        lst.add("Naci");
        lst.add("Esra");
        lst.add("Khayyam");
        lst.add("dimka");

        System.out.println(" team mates list = " + lst);

        for (int i = 0; i <lst.size() ; i++) {
            System.out.println("Item: "+(i+1)+" "+ lst.get(i));
        }
        System.out.println("First and last team mates");
        System.out.println(lst.get(0)+", "+lst.get(lst.size()-1));


        System.out.println("Reversed order of team mates");
        for (int i = lst.size()-1; i >=0 ; i--) {
            System.out.println(lst.get(i));
        }

        for (int i = 0; i <=lst.size()-2 ; i++) {
            System.out.println(lst.get(i)+" ----"+lst.get(i+1));
        }
        System.out.println("without repeating the name =======");
        for (int i = 0; i <=lst.size()-2 ; i+=2) {
            System.out.println(lst.get(i)+"--->>"+ lst.get(i+1));
        }

        for (int i = 0; i <=lst.size()-3 ; i+=3) {
            System.out.println(lst.get(i)+"->"+lst.get(i+1)+"->"+lst.get(i+2));
        }
        System.out.println("===============================");
        for (int i = 0; i <lst.size() ; i++) {
            if(i!=lst.size()-1){
                System.out.print(lst.get(i)+"-");
            }else{
                System.out.println(lst.get(i));
            }

        }

        String lstToString = lst.toString();
        System.out.println(lstToString);


        lst.set(lst.size()-1, "dilmir");
        System.out.println(lst);
    }
}

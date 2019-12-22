package OfficeHour;

public class TernaryCondition {

    public static void main(String[] args) {

        int bill = 2000;
        int qty = 10;
        int discount;

        discount = (bill>1000) ? (qty>11)? 10: 9: 5;
        System.out.println(discount);


        String name = "Dilmurod";
        String school = "";
        school = (name.equalsIgnoreCase("dilmurod"))? "Cybertek": "Go home";
        System.out.println(school);



        //if you buy 10 hats or more you will get 20% discount
        // if you buy 5 hats you will get 10 percent discount
        //if you buy less than 5 you will get 2 percent discount

        }
    }


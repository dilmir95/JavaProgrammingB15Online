package day40;

import java.util.ArrayList;

public class MarketActions {

    public static void main(String[] args) {

        Offer o1 = new Offer();

        o1.isFullTime = true;
        o1.company= "Apple";
        o1.salary = 10000000l;
        o1.location = "Silicon Valley";

        o1.displayInfo();


        Offer o2 = new Offer();
        o2.isFullTime = true;
        o2.company= "Amazon";
        o2.salary = 150000l;
        o2.location = "Washington";

        o2.displayInfo();

        Offer o3 = new Offer();
        o3.isFullTime = true;
        o3.company= "Goole";
        o3.salary = 159000l;
        o3.location = "New York";

        o3.displayInfo();

        ArrayList<Offer> myOffers = new ArrayList<>();

        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        System.out.println("===============================");
        System.out.println(myOffers);

        System.out.println(myOffers); // doesnt work to print

        for(Offer each: myOffers){
            each.displayInfo();
        }

        for (int i = 0; i <myOffers.size() ; i++) {
            Offer each = myOffers.get(i);

            each.displayInfo();
        }

    }
}

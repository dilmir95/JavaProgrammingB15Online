package day40;

public class HotMarketActions {

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

        Offer o4 = new Offer();


        o2.salary= o2.salary+2000;
        System.out.println(o2.salary);


        o4.salary = o1.salary+o2.salary+o3.salary;
        o4.turnToFullTime();
        o4.displayInfo();

        o4.changeLocation("Houston");
        o4.displayInfo();


        o1.changeAllInfo("Austin","CVS", 100500l, false);
        o1.displayInfo();

        System.out.println(o1.is100KClub());
        if(o1.is100KClub()){
            o1.changeLocation("Atlanta");
        }

        System.out.println(o1.toString());

        System.out.println(o1);


    }
}

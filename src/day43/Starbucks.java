package day43;

public class Starbucks {

    public static void main(String[] args) {

        Coffee c1 = new Coffee("Espresso",8, 3.99);

        c1 = null;

        System.out.println(c1);

        Coffee c2 = new Coffee("Intensito", 2, -23);

        System.out.println(c2);

        Coffee c3 = new Coffee();
        System.out.println(c3);
        c3.setType("Turkish");
        c3.setPrice(-3.99);
        c3.setCaffeineLvl(9);

        System.out.println(c3);


    }
}

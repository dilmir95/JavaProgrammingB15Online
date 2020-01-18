package day35;

public class WrapperClassIntro {

    public static void main(String[] args) {

        int x = 10;

        Integer xObj1 = new Integer(12);  //old way of doing it

            //valueOf method return object
        Integer xObj2 = Integer.valueOf(12);
        Integer xObj3 = Integer.valueOf("12");

        System.out.println(xObj2.equals(xObj3));

        byte bValue = xObj2.byteValue();
        System.out.println("byteValue = " + bValue);

        short sValue = xObj3.shortValue();
        System.out.println("shortValue = " + sValue);

        double  dValue = xObj1.doubleValue();
        System.out.println("double Value = " + dValue);

        Integer int1 = 12;
        int i1 = new Integer(int1);
        System.out.println(i1);






    }
}

package OfficeHour;

public class Practice12_30 {

    public static void main(String[] args) {


        Double price = 12.5d;

        int num = 99;

        Integer x = num;

        Long num1 = 100l;

        /*
        Useful methods in wrapper class
        Max_Value;
        Min_Value;
        parse converts string values to primatives;
        ValueOf converts string to wrapper class;

         */


        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        String s1 = "100.5";

        double d1 = Double.parseDouble(s1);

       double d2= Double.valueOf(s1);
        Double d3 = Double.valueOf(s1);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        String s4 = "False";

        boolean b4 = Boolean.parseBoolean(s4);

        Boolean b5 = Boolean.valueOf(s4);

    }

}

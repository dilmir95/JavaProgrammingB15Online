package day15;

import jdk.swing.interop.SwingInterOpUtils;

public class SubstringPractive {

    public static void main(String[] args) {

        String burger = "BigMac";

        System.out.println(burger.substring(0,3));
        System.out.println(burger.substring(3,6));


        String java = "ILOVEJAVA";
        System.out.println(java.substring(0,1));
        System.out.println(java.substring(1,5));
        System.out.println(java.substring(5,9));

        String movie = "Lord of the rings";
        System.out.println(movie.indexOf("of"));
        //to print "of"
        System.out.println(movie.substring(5,7));
        //to print "the"
        System.out.println(movie.substring(movie.indexOf("the"),movie.indexOf("rings")));

            //to print "of the ring"
        System.out.println(movie.substring(movie.indexOf(" "), movie.length()+0));
        // to print "of the ring"
        String secondWordFromLast = movie.substring(5,16);
        // to print "lord of"
        System.out.println(movie.substring(0,7));
        System.out.println(movie.substring(movie.indexOf("L"),movie.indexOf(" the")));

        //to print the rest of the string starting from a point
        String secomdtoLast = movie.substring(5);
        System.out.println(secomdtoLast);

        // ring of the lord
        System.out.println(movie.substring(12,16) +" " +movie.substring(5,7)+" "+ movie.substring(8,11)+
               " " +movie.substring(0,4));

        System.out.println(movie.substring(12,16)+" "+ movie.substring(5,11)+" Java "+movie.substring(0,4));
    }
}

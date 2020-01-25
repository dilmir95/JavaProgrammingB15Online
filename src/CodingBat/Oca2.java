package CodingBat;

public class Oca2 {

    public static void main(String[] args) {


        String res = "no result";
        String stuff = "TV";

        res = stuff.equals("TV") ? stuff.equals("Movie") ? "Walter" : "White" : "No Result";
        String res1 = stuff.equals("TV")? "Walter" : stuff.equals ("Movie")? "White" : "No Result";
        System.out.println(res);
        System.out.println(res1);
    }
}
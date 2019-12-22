package day15;

public class StringInsensitiveCheck {


    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println(name.contains("st"));

        System.out.println(name.toUpperCase() );
        String name1 = name.toUpperCase();

        System.out.println(name1.contains("ST"));

        //method chain , combining multiple method call
        //make my name to all lower case and check if it contains "st"
        System.out.println(name.toLowerCase().contains("st"));


    }
}

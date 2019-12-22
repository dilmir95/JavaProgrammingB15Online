package day15;

public class ReverseAString  {

    public static void main(String[] args) {
        String name = "Dilmurod";

        System.out.println(name.charAt(0)+" "+ name.charAt(1)+" "+name.charAt(2));

        System.out.println(name.charAt(2)+" "+ name.charAt(1)+" "+name.charAt(0));

        System.out.println(name.lastIndexOf("d"));

        System.out.println(name.charAt(7));
        System.out.println(name.charAt(name.length()-1));
    }
}

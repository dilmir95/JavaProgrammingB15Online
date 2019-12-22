package day13;

public class TestStringStartWithorEndWith {

    public static void main(String[] args) {


        String name = "Dilmurod";

        //check if name start with another string
        System.out.println(name.startsWith("dil"));

        //check if name end with another string
        System.out.println(name.endsWith("rod"));

        System.out.println(name.endsWith("d"));

    }
}

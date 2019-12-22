package day31;

public class Greeting {

    public static void main(String[] args) {

        sayHelloTo( "Kids" );
        sayHelloTo("Dilmurod");
        sayHelloTo("World");

        yourAge(24);
    }
    public static void sayHello(){
        System.out.println("Hello, B15");
    }
    public static void sayHelloTo(String name ){
        System.out.println("Hello "+ name);
    }
    public static void yourAge (int age ){
        System.out.println("you were born in the year of "+(2019-age));

    }
}

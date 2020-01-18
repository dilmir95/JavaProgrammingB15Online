package day34;

public class MethodOverloadingIntro {

    public static void main(String[] args) {


        //method overloading
        //using same name and different parameter for methods
        //to reuse the name for similiar actions

        sayHello();
        sayHello("Dimka");
        sayHello(77);
        System.out.println( sayHello("Dilmurod","Yakubov"));
    }


    public static void sayHello(){
        System.out.println("Hello, World");
    }

    public static void sayHello(String name){
        System.out.println("Hello, "+name);
    }

    public static void sayHello(int num){
        System.out.println("Hello, "+num);
    }
    public static String sayHello(String name, String lastName){
        return "Hello "+ name+" "+ lastName;
    }
}

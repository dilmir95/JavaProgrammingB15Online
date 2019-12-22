package day31;

public class MethodIntro {

    public static void main(String[] args) {

        //two ways to call static method
        //ClassName.methodName(external data if needed)


        //Method is needed to reuse a code


        //MethodIntro.sayHello();
        System.out.println("begin");
        sayHello();
        System.out.println("=========");
        sayHello();
        System.out.println("end");
    }
    //do not create a method inside main method , before last curly braces
    public static void  sayHello(){
        System.out.println("Hello World");
        System.out.println("My name is Dilmurod");
        System.out.println("I love Java");
    }
}

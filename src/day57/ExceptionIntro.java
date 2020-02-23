package day57;

public class ExceptionIntro {

    public static void main(String[] args) {

        System.out.println("Hello World");
        try{
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Exception happened and was handled");
        }finally {
            System.out.println("World go on!");
        }

        try{
            System.out.println("second try block");
            String str = "dil";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(2));
            System.out.println(str.charAt(30));
            System.out.println(str.charAt(1));


        }catch (Exception e ){
            System.out.println("cought an exception");

        }
        System.out.println("continuing our programm");

    }
}

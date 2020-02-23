package day58;

public class TryCatchFinally {

    public static void main(String[] args) {

        System.out.println("Before try catch");

        try{
            System.out.println("Hello from try block");
            String str = null;
            str.concat("sasa");

        }catch (Exception e){
            System.out.println("exception was caught");
        }finally {
            System.out.println("executing finally");
        }
    }
}

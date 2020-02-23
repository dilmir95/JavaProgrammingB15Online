package day58;

public class CheckedExceptionDema {

    public static void main(String[] args) {
        System.out.println("Hello world");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Exception was caught");
        }
        System.out.println("after waiting");
        //above is handled
    }
    public static void printMessage() throws ArithmeticException{
        System.out.println();
    }
}

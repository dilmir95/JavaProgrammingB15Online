package day36;

public class WrapperReview {

    public static void main(String[] args) {

        Integer i1 = new Integer(1000);

        Integer i2 = Integer.valueOf(123);

        Integer i3 = 45;


        sumAndPrint(i2,i3);

        sumAndPrint(12,45);

        printTheDoubleValue(i3);
    }

    public static void sumAndPrint (Integer x, Integer y ){

        int sum;
        System.out.println(x+y);
    }

    public static void printTheDoubleValue(int x){
        System.out.println(x*2);
    }
}

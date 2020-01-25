package day43;

public class StarbucksUtil {

    public static void main(String[] args) {
        Coffee c1 = new Coffee("sasasasq", 12, 12);
        Coffee c2 = new Coffee();
        printInfo(c2);

        printInfo(new Coffee("intensito", 9,1));

        printInfo(c1);
        printStringInfo(c1);
    }
    public static void printInfo (Coffee obj1){
        System.out.println(obj1.toString());
    }
    public static void printStringInfo( Coffee obj1){
        System.out.println("first char is = " + obj1.getType().charAt(0));
        System.out.println("first char is = " + obj1.getType().charAt(obj1.getType().length()-1));

    }


}

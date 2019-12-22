package day16;

public class IndexOfWith2Parameters {

    public static void main(String[] args) {


        String name = "i love java I love java java java java" ;


        System.out.println(name.indexOf("java"));

        System.out.println(name.indexOf("java", 7));
        System.out.println(name.indexOf("java", 8));
        System.out.println(name.indexOf("java", 20));


        int firstJavaLocation = name.indexOf("java");

        int startingtPointForSecondJava = firstJavaLocation+1;

        int secondJavaLocation = name.indexOf("java", startingtPointForSecondJava);
        System.out.println(secondJavaLocation);


        int thirdJavaLocation = name.indexOf("java", 20);

        System.out.println(thirdJavaLocation);


        System.out.println(name.indexOf("java", 25));



    }
}

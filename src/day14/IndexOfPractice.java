package day14;

public class IndexOfPractice {

    public static void main(String[] args) {

        //indexOf find out the index of another string inside this string

        String name = "Game of Java";

        System.out.println(name.indexOf("Java"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf(" "));
        System.out.println(name.length());
        System.out.println(name.indexOf("o"));
        //we get a minus number when we ask for invalid index
        System.out.println(name.indexOf("N"));
    }
}

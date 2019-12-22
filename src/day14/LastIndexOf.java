package day14;

public class LastIndexOf {

    public static void main(String[] args) {

        String name = "Game of Java";

        System.out.println(name.lastIndexOf(" "));
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println(name.lastIndexOf("Kawa"));
        System.out.println(name.lastIndexOf("a"));

       if(name.lastIndexOf("Java")>-1) {
           System.out.println("Jawa found");
       }else{
           System.out.println("no kawa");
       }
    }
}

package day14;

public class TrimAndIsEmpty {

    public static void main(String[] args) {

        String message = "   Repl is Coming  ";

        System.out.println(message.length() );

        System.out.println(message.trim());
        message = message.trim();
        System.out.println(message.length());

        System.out.println(message.isEmpty());
        String name = "";
        System.out.println(name.isEmpty());


        String name2 = "dilmurod";
        System.out.println(name2.indexOf("d",1));

        System.out.println(name2.substring(0,3));
        System.out.println(name2.substring(3,8));

        String s4 = name2.concat(" "+message);
        System.out.println( s4);

        System.out.println(name2.replace('j','d'));




    }
}

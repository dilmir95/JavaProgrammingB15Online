package day15;

public class ReplaceMethod {

    public static void main(String[] args) {
        String message = "I love pumpkin, pumpkin is Fun";

        String message2=  message.replace("pumpkin", "java");
        System.out.println(message2);

        String message3 = "Happy thanks giving to all";
        String message3new = message3.replace("thanks giving", "thanksgiving");
        System.out.println(message3new);
    }
}

package replit;

public class Task182 {

    public static void main(String[] args) {


    }

    public static String clean (String text ,String badWord) {
            String result="";
        if(text.contains(badWord)){
            result = text.replace(badWord, "");
        }
        return result;
}
}
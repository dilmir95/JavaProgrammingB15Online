package replit;

public class Task191 {

    public static void main(String[] args) {

            reverse("dimka");

    }

    public static String reverse(String input)
    {
        String result = "";
        int lastIndex = input.length()-1;
        for(int i=lastIndex; i>=0; i--){
            result+= input.charAt(i);
        }

        return result;
    }
}

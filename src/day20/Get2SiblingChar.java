package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        //print 2 char in one line as below example
        //ayra ar yr ra

        String name = "Ayra";

        int charCount = name.length();
        for (int x = 0; x <= name.length()-3; x+=1) {
            System.out.println(name.substring(x, x+3));
        }


    }
}
